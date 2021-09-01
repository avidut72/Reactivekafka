package com.kafka.controller;

import static com.kafka.constants.ClientConstants.WEBCLIENT_URL;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.kafka.Source;
import com.kafka.api.apiConnection;
import com.kafka.controller.dto.DestinationMessageDto;
import com.kafka.exception.GlobalException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pojo.destination.DestinationMessage;
import pojo.destination.ExtAttributes;
import pojo.source.Items;
import pojo.source.OrderExtendAttribute;
import pojo.source.OrderItemExtendAttribute;
import pojo.source.SourceMessage;
import reactor.core.publisher.Flux;
import reactor.kafka.receiver.ReceiverRecord;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumerController {
	private static final Logger logger = LoggerFactory.getLogger(KafkaConsumerController.class);
	private final Flux<ReceiverRecord<String, String>> reactiveKafkaReceiver=null;
	private Gson gson = new GsonBuilder().create();
	DestinationMessageDto messageDto;
	DestinationMessage destination = new DestinationMessage();
	apiConnection connect = new apiConnection();
	JsonElement jsonElement;
	
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	JsonObject jsonObject = new JsonObject();
	List<OrderItemExtendAttribute> orderItemExtendedAttribute = new ArrayList<OrderItemExtendAttribute>();
	
		@EventListener(ApplicationStartedEvent.class)
		public void onMessage() {
			reactiveKafkaReceiver
			.doOnNext(r-> messageparse(r))
			.doOnError(e-> new GlobalException("Kafka Flux exception"+ e.getMessage(),HttpStatus.BAD_REQUEST))
			.subscribe();
		}

		@SuppressWarnings({ "unlikely-arg-type", "null" })
		private void messageparse(ReceiverRecord<String, String> remote) {
			SourceMessage source = gson.fromJson(remote.value(), SourceMessage.class);
			List<DestinationMessage> destinationList = new ArrayList<>();
			OrderExtendAttribute orderAttributes = null;
			for(Items eachItem : source.getQuote().getItems()) {
				if(eachItem.getChange().equals(Source.DELETED)){
					messageDto.setPartNumber(eachItem.getPartNumber());
					messageDto.setShortDescription(eachItem.getShortDescription());
					for(OrderItemExtendAttribute eachAttribute:eachItem.getOrderItemExtendAttribute()) {
						
						if(eachAttribute.getAttributeName().equals("spTaskId"))
								messageDto.setExtTaskId(eachAttribute.getAttributeValue()); 
						
						else if(eachAttribute.getAttributeName().equals("spTaskName"))
								messageDto.setExtTaskName(eachAttribute.getAttributeValue());
						
						else if(eachAttribute.getAttributeName().equals("spUserId"))
								messageDto.setExtUserId(eachAttribute.getAttributeValue()); 
						
						else if(eachAttribute.getAttributeName().equals("spUserName"))
								messageDto.setExtUserName(eachAttribute.getAttributeValue()); 
						
						else if(eachAttribute.getAttributeName().equals("spLocationId"))
								messageDto.setExtLocationId(eachAttribute.getAttributeValue());
						
						else if(eachAttribute.getAttributeName().equals("spLocationName"))
								messageDto.setExtLocationName(eachAttribute.getAttributeValue());
						else{
							logger.info("Error");
						}
					}
					
					messageDto.setStatus(eachItem.getChange());
					messageDto.setKey(orderAttributes.getAttributeValue());
					messageDto.setValue(orderAttributes.getAttributeValue());
					ExtAttributes extAttributes= new ExtAttributes(messageDto.getKey(),messageDto.getValue());
					destination.setPartNumber(messageDto.getPartNumber());
					destination.setShortDescription(messageDto.getShortDescription());
					destination.setExtTaskName(messageDto.getExtTaskName());
					destination.setExtTaskId(messageDto.getExtTaskId());
					destination.setExtUserId(messageDto.getExtUserId());
					destination.setExtUserName(messageDto.getExtUserName());
					destination.setExtLocationId(messageDto.getExtLocationId());
					destination.setExtLocationName(messageDto.getExtLocationName());
					destination.setStatus(messageDto.getStatus());
					List<ExtAttributes> extraAttribute = destination.getExtAttributes();
					extraAttribute.add(extAttributes);
					destination.setExtAttributes(extraAttribute);
					destinationList.add(destination);			
				}
			}	
			for(Items orderItem : source.getOrder().getItems()) {
				if(orderItem.getStatus().equals(Source.DELIVERED) || orderItem.getChange().equals(Source.ORDERED) || orderItem.getChange().equals(Source.SHIPPED)) {
					messageDto.setPartNumber(orderItem.getPartNumber());
					messageDto.setShortDescription(orderItem.getShortDescription());
					for(OrderItemExtendAttribute eachAttribute:orderItem.getOrderItemExtendAttribute()) {
						
						if(eachAttribute.getAttributeName().equals("spTaskId"))
								messageDto.setExtTaskId(eachAttribute.getAttributeValue()); 
						
						else if(eachAttribute.getAttributeName().equals("spTaskName"))
								messageDto.setExtTaskName(eachAttribute.getAttributeValue());
						
						else if(eachAttribute.getAttributeName().equals("spUserId"))
								messageDto.setExtUserId(eachAttribute.getAttributeValue()); 
						
						else if(eachAttribute.getAttributeName().equals("spUserName"))
								messageDto.setExtUserName(eachAttribute.getAttributeValue()); 
						
						else if(eachAttribute.getAttributeName().equals("spLocationId"))
								messageDto.setExtLocationId(eachAttribute.getAttributeValue());
						
						else if(eachAttribute.getAttributeName().equals("spLocationName"))
								messageDto.setExtLocationName(eachAttribute.getAttributeValue());
						
						else {
							logger.info("Error");
						}
					}
					
					messageDto.setStatus(orderItem.getStatus());
					messageDto.setKey(orderAttributes.getAttributeValue());
					messageDto.setValue(orderAttributes.getAttributeValue());
					ExtAttributes extAttributes= new ExtAttributes(messageDto.getKey(),messageDto.getValue());
					destination.setPartNumber(messageDto.getPartNumber());
					destination.setShortDescription(messageDto.getShortDescription());
					destination.setExtTaskName(messageDto.getExtTaskName());
					destination.setExtTaskId(messageDto.getExtTaskId());
					destination.setExtUserId(messageDto.getExtUserId());
					destination.setExtUserName(messageDto.getExtUserName());
					destination.setExtLocationId(messageDto.getExtLocationId());
					destination.setExtLocationName(messageDto.getExtLocationName());
					destination.setStatus(messageDto.getStatus());
					List<ExtAttributes> extraAttribute = destination.getExtAttributes();
					extraAttribute.add(extAttributes);
					destination.setExtAttributes(extraAttribute);
					destinationList.add(destination);			
					jsonElement = gson.toJsonTree(destinationList);
				}
			}
			
			String response = connect.connection(WEBCLIENT_URL, jsonElement, HttpMethod.POST);
			System.out.println("response received"+response);
		}
}

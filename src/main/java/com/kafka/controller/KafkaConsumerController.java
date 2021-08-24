package com.kafka.controller;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.kafka.Source;
import com.kafka.exception.GlobalException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import pojo.destination.DestinationMessage;
import pojo.destination.ExtAttributes;
import pojo.source.Items;
import pojo.source.OrderItemExtendedAttribute;
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
	
	
	String partNumber;
	String shortDescription;
	String extTaskId;
	String extTaskName;
	String extUserId;
	String extUserName;
	String extLocationId;
	String extLocationName;
	String status;
	List<ExtAttributes> extAttributes;
	
	@Autowired
	private ModelMapper modelMapper;
	List<OrderItemExtendedAttribute> orderItemExtendedAttribute = new ArrayList<OrderItemExtendedAttribute>();
	
		@EventListener(ApplicationStartedEvent.class)
/*		public void onMessage() {
			reactiveKafkaReceiver
			.doOnNext(r->{if(r.)})
			.doOnError(e->Log.error("KafkaFlux exception",e))
			.subscribe();
}*/
		public void onMessage() {
			reactiveKafkaReceiver
			.doOnNext(r-> messageparse(r))
			.doOnError(e-> new GlobalException("Kafka Flux exception"+ e.getMessage(),HttpStatus.BAD_REQUEST))
			.subscribe();
		}

		private void messageparse(ReceiverRecord<String, String> remote) {
			SourceMessage source = gson.fromJson(remote.value(), SourceMessage.class);
			List<DestinationMessage> destinationList = new ArrayList<>();
			for(Items eachItem : source.getQuote().getItem()) {
				if(eachItem.getChange().equals(Source.DELETED) || eachItem.getChange().equals(Source.DELIVERED) || eachItem.getChange().equals(Source.ORDERED) || eachItem.getChange().equals(Source.SHIPPED)){
					partNumber = eachItem.getPartNumber();
					shortDescription = eachItem.getShortDescription();
					for(OrderItemExtendedAttribute eachAttribute:source.getQuote().getOrderItemAttribute()) {
						extTaskId = eachAttribute.getAttributeValue() ;
						extTaskName = eachAttribute.
						
					}
					extTaskId = orderItemExtendedAttribute.getAttributeValue();
					extTaskName = orderItemExtendedAttribute.getAttributeName();
					extUserId = ;
					extUserName=;
					extLocationId=;
					extLocationName=;
					status=;
					extAttributes=;
					
					DestinationMessage destination = new DestinationMessage(partNumber, shortDescription, extTaskId, extTaskName, extUserId, extUserName, extLocationId, extLocationName, status, extAttributes);
					destinationList.add(destination);
					}else {
					System.out.println("Skipped...");				
				}
			}	
			for(Items orderItem : source.getOrder().getItems()) {
				if(orderItem.getChange().equals(Source.DELIVERED) || orderItem.getChange().equals(Source.ORDERED) || orderItem.getChange().equals(Source.SHIPPED)) {
					partNumber = orderItem.getPartNumber();
					shortDescription = orderItem.getShortDescription();
					for(OrderItemExtendedAttribute eachAttribute:source.getQuote().getOrderItemAttribute()) {
						extTaskId = eachAttribute.getAttributeValue() ;
						extTaskName = eachAttribute.
						}
					extTaskId = orderItemExtendedAttribute.getAttributeValue();
					extTaskName = orderItemExtendedAttribute.getAttributeName();
					extUserId = ;
					extUserName=;
					extLocationId=;
					extLocationName=;
					status=;
					extAttributes=;
					
					DestinationMessage destination = new DestinationMessage(partNumber, shortDescription, extTaskId, extTaskName, extUserId, extUserName, extLocationId, extLocationName, status, extAttributes);
					destinationList.add(destination);
				}else {
					System.out.println("Skipped...");
				}
			}
			
		}
}

package com.kafka.config;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kafka.serialization.CustomDeserializer;

import pojo.source.SourceMessage;
import reactor.core.publisher.Flux;
import reactor.kafka.receiver.KafkaReceiver;
import reactor.kafka.receiver.ReceiverOptions;
import reactor.kafka.receiver.ReceiverRecord;

@Configuration
public class KafkaConsumerConfig {
	@Value("${spring.kafka.consumer.bootstrap-servers}")
	private String bootstrapServers;
	@Value("${spring.kafka.consumer.group-id}")
	private String groupId;
	@Value("${spring.kafka.consumer.key-deserializer}")
	private StringDeserializer keyDeserializer;
	@Value("${spring.kafka.consumer.auto-offset-reset}")
	private String offset;	
	@Bean
	Map<String, Object> kafkaConsumerConfiguration(){
		Map<String, Object> configuration = new HashMap<>();
		configuration.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServers);
		configuration.put(ConsumerConfig.GROUP_ID_CONFIG, groupId);
	    configuration.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, offset);
	    configuration.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true);
	    configuration.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, keyDeserializer);
	    configuration.put(CustomDeserializer.CONFIG_VALUE_CLASS, SourceMessage.class.getName());
	    return configuration;
	    }
	@Bean
	public ReceiverOptions<?, ?> receiverOptions(ReceiverOptions<?, ?> receiver) {
		return receiver;
	}
	
	@Bean
	private ReceiverOptions<String, Object> kafkaReceiverOptions(@Value("${spring.kafka.consumer.topic}")String[] inTopicName){
		ReceiverOptions<String,Object> options= ReceiverOptions.create(kafkaConsumerConfiguration());
		return options.subscription(Arrays.asList(inTopicName));
//				.withKeyDeserializer(keyDeserializer)
//				.withValueDeserializer(CustomDeserializer.CONFIG_VALUE_CLASS, SourceMessage.class.getName());
		
	}
	
	@Bean
	Flux<ReceiverRecord<String, SourceMessage>> reactiveKafkaReceiver(ReceiverOptions<String,SourceMessage> kafkaReceiverOptions) {
        return KafkaReceiver.create(kafkaReceiverOptions).receive();
        }
}
	
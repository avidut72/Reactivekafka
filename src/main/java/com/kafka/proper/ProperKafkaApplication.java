package com.kafka.proper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kafka.controller.KafkaConsumerController;

@SpringBootApplication
public class ProperKafkaApplication {
	static KafkaConsumerController consumerController;

	public static void main(String[] args) throws Exception{
		try {
		SpringApplication.run(ProperKafkaApplication.class, args);
	//	String Response = consumerController.onMessage();
	
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}

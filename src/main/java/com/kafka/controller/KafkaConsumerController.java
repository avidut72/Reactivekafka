package com.kafka.controller;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import pojo.source.SourceMessage;
import reactor.core.publisher.Flux;
import reactor.kafka.receiver.ReceiverRecord;

@Component
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumerController {
	private final Flux<ReceiverRecord<String, SourceMessage>> reactiveKafkaReceiver;
	SourceMessage msg;
		@EventListener(ApplicationStartedEvent.class)
		public void onMessage() {
			reactiveKafkaReceiver
			.doOnNext(r->{if(r.)})
			.doOnError(e->Log.error("KafkaFlux exception",e))
			.subscribe();
}
}

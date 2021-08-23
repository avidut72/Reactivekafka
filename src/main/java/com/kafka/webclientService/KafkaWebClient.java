package com.kafka.webclientService;

import org.springframework.web.reactive.function.client.WebClient;
import static com.kafka.constants.ClientConstants.POST_ALL_VALUES;

public class KafkaWebClient {
	
	private WebClient webClient;
	
	public KafkaWebClient(WebClient webClient) {
		this.webClient = webClient;
	}
	
	public void sendWebclientData() {
		
		webClient.post().uri(POST_ALL_VALUES)
		.syncBody()
		.retrieve()
		
	}
	
}

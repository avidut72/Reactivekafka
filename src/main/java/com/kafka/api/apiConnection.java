package com.kafka.api;

import static com.kafka.constants.ClientConstants.WEBCLIENT_URL;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import com.google.gson.JsonObject;

import reactor.core.publisher.Mono;

public class apiConnection {
	
	WebClient client = WebClient.create(WEBCLIENT_URL);
	
	public String connection(String url, Object body, HttpMethod httpMethod) {
		
		JsonObject response = null;
		if(httpMethod.equals(HttpMethod.POST)) {
			response = client.post()
							.uri(url)
							.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
							.body(Mono.just(body), JsonObject.class)
							.retrieve()
							.bodyToMono(JsonObject.class)
							.block();
		}
		return response.toString();
		
	}
}

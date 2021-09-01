package com.kafka.api;

import static com.kafka.constants.ClientConstants.WEBCLIENT_URL;

import org.slf4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import com.google.gson.JsonObject;
import com.kafka.exception.ClientException;

import reactor.core.publisher.Mono;

public class apiConnection{
	
	WebClient client = WebClient.create(WEBCLIENT_URL);
	Logger log;
	public String connection(String url, Object body, HttpMethod httpMethod) {
		
		JsonObject response = null;
		if(httpMethod.equals(HttpMethod.POST)) {
			response = client.post()
							.uri(url)
							.header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
							.body(Mono.just(body), JsonObject.class)
							.retrieve()
							.onStatus(HttpStatus::is4xxClientError,
									clientResponse->{
										log.error("Bad Request {}",clientResponse);
										return Mono.error(
												new ClientException(
														"Client Error", clientResponse.statusCode()));
										
									})
							.onStatus(HttpStatus::is5xxServerError, 
									clientResponse->{
										log.error("Internal Server Error {}", clientResponse);
										return Mono.error(
												new ClientException("Internal Server Error", clientResponse.statusCode()));
									})
							.bodyToMono(JsonObject.class)
							.log()
							.block();
		}
		return response.toString();
		
	}
}

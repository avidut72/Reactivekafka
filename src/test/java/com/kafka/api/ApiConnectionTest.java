package com.kafka.api;

import static com.kafka.constants.ClientConstants.WEBCLIENT_URL;

import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;

import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import pojo.destination.DestinationMessage;

public class ApiConnectionTest {
	@Autowired
	apiConnection connection;
	
	public static MockWebServer mockBackEnd;
	private ObjectMapper mapp;
	Logger log;

	@BeforeAll
	protected static void setUp() throws IOException {
		mockBackEnd = new MockWebServer();
		mockBackEnd.start();
	}

	@AfterAll
	protected static void tearDown() throws IOException {
		mockBackEnd.shutdown();
	}

	@Test
	public void testConnectionWebclient500() {
		DestinationMessage mockDestinationMessage = new DestinationMessage();
		try {
			mockBackEnd.enqueue( new MockResponse()
						.setStatus("HTTP/1.1 500")
						.setBody(mapp.writeValueAsString(mockDestinationMessage))
						.addHeader(HttpHeaders.CONTENT_TYPE,MediaType.APPLICATION_JSON_VALUE));
			
			String response = connection.connection(WEBCLIENT_URL, mockDestinationMessage, HttpMethod.POST);
			RecordedRequest recordRequest = mockBackEnd.takeRequest();
		} catch (Exception e) {
			
			log.error("Exception occured "+e);
		}
		
	}
	
	@Test
	public void testConnectionWebclient400() {
		DestinationMessage mockDestinationMessage = new DestinationMessage();
		try {
			mockBackEnd.enqueue( new MockResponse()
						.setStatus("HTTP/1.1 400")
						.setBody(mapp.writeValueAsString(mockDestinationMessage))
						.addHeader(HttpHeaders.CONTENT_TYPE,MediaType.APPLICATION_JSON_VALUE));
			
			String response = connection.connection(WEBCLIENT_URL, mockDestinationMessage, HttpMethod.POST);
			RecordedRequest recordRequest = mockBackEnd.takeRequest();
		} catch (Exception e) {
			
			log.error("Exception occured "+e);
		}
	}

}

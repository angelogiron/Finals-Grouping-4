package com.it1311l.uap.oneflightapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import com.it1311l.uap.oneflightapp.webclient.AmadeusApiClient;


@Configuration
public class AmadeusApiConfig {
	@Bean
	AmadeusApiClient amadeusApi() {
		WebClient webClient = WebClient.builder()
				.baseUrl("https://test.api.amadeus.com/v1/")
				.defaultHeader("X-RapidAPI-Key", "5yuU1EijZo5JVt8HrMzddJOZ71fq")
				.defaultHeader("X-RapidAPI-Host", "test.api.amadeus.com")
				.build();
		
		HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory
				.builder(WebClientAdapter.forClient(webClient))
				.build();
		
		return httpServiceProxyFactory.createClient(AmadeusApiClient.class);
	}
}
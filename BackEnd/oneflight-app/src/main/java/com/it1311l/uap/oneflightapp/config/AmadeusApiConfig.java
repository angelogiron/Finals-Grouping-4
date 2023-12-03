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
				.baseUrl("https://test.api.amadeus.com/")
<<<<<<< HEAD
		.defaultHeader("Authorization", "Bearer " + "2brXLKY7A7hhYW5yquz4mysWHQdP")
=======
		.defaultHeader("Authorization", "Bearer " + "NT8YNFh5TuPnnffaBjG9iCHXtJcc")
>>>>>>> 6b009c3fd2900bed63742578902edcf24e4cd17f
				.build();
		
		HttpServiceProxyFactory httpServiceProxyFactory = HttpServiceProxyFactory
				.builder(WebClientAdapter.forClient(webClient))
				.build();
		
		return httpServiceProxyFactory.createClient(AmadeusApiClient.class);
	}
}

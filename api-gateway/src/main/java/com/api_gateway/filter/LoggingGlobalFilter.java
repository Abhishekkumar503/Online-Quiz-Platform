package com.api_gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class LoggingGlobalFilter implements GlobalFilter {

	private static final Logger logger = LoggerFactory.getLogger(LoggingGlobalFilter.class);

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		// TODO Auto-generated method stub
		logger.info("Incoming request path: {}", exchange.getRequest().getPath());
		return chain.filter(exchange).then(
				Mono.fromRunnable(() -> logger.info("Response Status: {}", exchange.getResponse().getStatusCode())));
	}

}

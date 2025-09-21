package com.ncu.college.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                // Route for soil service
                .route("soilservice", r -> r.path("/Soils/**")
                .uri("lb://soilservice")) // change port if soilservice runs elsewhere

                // Route for fertilizer service
                .route("fertilizerservice", r -> r.path("/fertilizers/**")
                .uri("lb://fertilizerservice")) // change port if soilservice runs elsewhere

                // Route for crop service
                .route("cropservice", r -> r.path("/crops/**")
                .uri("lb://cropservice")) // change port if soilservice runs elsewhere

                .build();
    }
}

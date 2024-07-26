package com.iiht.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator gatewayRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        return routeLocatorBuilder.routes().route("lbservice",
                route->route.path("/test/**")
                        .uri("lb://LBSERVICE"))
                        .build();
    }
}

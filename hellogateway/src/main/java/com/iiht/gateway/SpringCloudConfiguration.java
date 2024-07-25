package com.iiht.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfiguration {
//    @Bean
//    public RouteLocator gatewayRouteLocator(RouteLocatorBuilder builder){
//        return builder.routes()
//                .route("helloservice",r->r.path("/api/v1/**").filters(f->f.addRequestHeader("Hello","World")).uri("http://localhost:8071"))
//                .route("helloservice-2",r->r.path("/api/v2/**").uri("http://localhost:8090"))
//                .build();
//    }
}

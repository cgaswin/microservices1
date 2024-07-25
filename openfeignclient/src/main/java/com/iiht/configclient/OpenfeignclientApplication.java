package com.iiht.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OpenfeignclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenfeignclientApplication.class, args);
    }

}

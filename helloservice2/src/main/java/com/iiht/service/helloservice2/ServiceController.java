package com.iiht.service.helloservice2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/")
public class ServiceController {

    @GetMapping
    public String service2(){
        return "Hello from service 2";
    }
}

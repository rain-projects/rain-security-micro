package com.rain.microproduct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class MicroProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroProductApplication.class, args);
    }

    @Autowired
    private OrderFeignClient orderFeignClient;

    @RequestMapping("/test")
    public String testFeign() {
        return orderFeignClient.get();
    }
}

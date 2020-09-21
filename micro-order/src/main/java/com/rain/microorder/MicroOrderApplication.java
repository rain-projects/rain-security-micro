package com.rain.microorder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
@EnableDiscoveryClient
@EnableFeignClients
public class MicroOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroOrderApplication.class, args);
    }

    @Value(value = "${useLocalCache:false}")
    private String useLocalCache;

    @RequestMapping("/get")
    public String getUseLocalCache() {
        System.out.println(useLocalCache);
        return useLocalCache;
    }

}

package com.rain.microproduct;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "order")
public interface OrderFeignClient {

    @RequestMapping("/get")
    String get();

}

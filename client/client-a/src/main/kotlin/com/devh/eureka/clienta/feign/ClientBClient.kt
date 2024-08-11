package com.devh.eureka.clienta.feign

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(name="eureka-client-b")
interface ClientBClient {
    @GetMapping("/client-b/hello")
    fun getHello(): String
}
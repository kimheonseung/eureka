package com.devh.eureka.clientb.controller

import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("client-b/hello")
class HelloController(
    val environment: Environment,
) {
    @GetMapping
    fun getHello() = "hello \nfrom client-b:${environment.getProperty("local.server.port")} \n${LocalDateTime.now()}"
}
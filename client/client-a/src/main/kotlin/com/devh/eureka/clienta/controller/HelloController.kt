package com.devh.eureka.clienta.controller

import com.devh.eureka.clienta.service.ClientBService
import org.springframework.core.env.Environment
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
@RequestMapping("client-a/hello")
class HelloController(
    val clientBService: ClientBService,
    val environment: Environment,
) {
    @GetMapping
    fun getHello() = "hello \nfrom client-a:${environment.getProperty("local.server.port")} \n${LocalDateTime.now()}"

    @GetMapping("/b")
    fun getHelloB() = clientBService.getHello()
}
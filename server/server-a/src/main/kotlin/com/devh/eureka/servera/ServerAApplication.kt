package com.devh.eureka.servera

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ServerAApplication

fun main(args: Array<String>) {
    runApplication<ServerAApplication>(*args)
}

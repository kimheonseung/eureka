package com.devh.eureka.serverb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ServerBApplication

fun main(args: Array<String>) {
    runApplication<ServerBApplication>(*args)
}

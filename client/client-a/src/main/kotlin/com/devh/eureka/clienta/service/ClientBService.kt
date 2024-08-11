package com.devh.eureka.clienta.service

import com.devh.eureka.clienta.feign.ClientBClient
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.stereotype.Service

@Service
class ClientBService(
    val clientBClient: ClientBClient,
) {
    fun getHello() = clientBClient.getHello()
}
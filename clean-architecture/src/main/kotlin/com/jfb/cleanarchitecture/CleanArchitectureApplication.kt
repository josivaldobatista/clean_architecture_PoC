package com.jfb.cleanarchitecture

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients
import org.springframework.kafka.annotation.EnableKafka

@EnableKafka
@EnableFeignClients
@SpringBootApplication
class CleanArchitectureApplication

fun main(args: Array<String>) {
	runApplication<CleanArchitectureApplication>(*args)
}

package com.jfb.cleanarchitecture

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.feign.EnableFeignClients

@EnableFeignClients
@SpringBootApplication
class CleanArchitectureApplication

fun main(args: Array<String>) {
	runApplication<CleanArchitectureApplication>(*args)
}

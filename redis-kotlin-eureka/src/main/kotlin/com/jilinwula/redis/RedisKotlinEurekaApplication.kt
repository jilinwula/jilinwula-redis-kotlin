package com.jilinwula.redis

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@EnableEurekaServer
@SpringBootApplication
class RedisKotlinEurekaApplication

fun main(args: Array<String>) {
    runApplication<RedisKotlinEurekaApplication>(*args)
}

package com.orderapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OrderConsumerAppApplication

fun main(args: Array<String>) {
    runApplication<OrderConsumerAppApplication>(*args)
}

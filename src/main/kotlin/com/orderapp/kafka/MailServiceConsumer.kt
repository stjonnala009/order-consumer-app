package com.orderapp.kafka

import com.orderapp.kafka.KafkaConsumerConfig.Companion.TOPIC
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener

class MailServiceConsumer {
    @KafkaListener(topics = [TOPIC])
    fun receive(payload: String) {
        LOGGER.info("Received payload='$payload'")
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(MailServiceConsumer::class.java)
    }
}

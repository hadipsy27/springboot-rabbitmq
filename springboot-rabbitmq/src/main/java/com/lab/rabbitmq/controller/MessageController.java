package com.lab.rabbitmq.controller;

import com.lab.rabbitmq.publisher.RabbitMQProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    private RabbitMQProducer producer;

    public MessageController(RabbitMQProducer producer) {
        this.producer = producer;
    }

    // localhost:8080/api/v1/publish?message=Hello
    @GetMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestParam("message") String message) {
        producer.sendMessage(message);
        return ResponseEntity.ok("Message Sent to RabbitMQ...");

    }

}

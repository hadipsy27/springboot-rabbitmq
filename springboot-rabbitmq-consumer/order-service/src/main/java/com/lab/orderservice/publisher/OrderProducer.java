package com.lab.orderservice.publisher;

import com.lab.orderservice.dto.OrderEvent;
import org.slf4j.Logger;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {

    private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(OrderProducer.class);

    @Value("${rabbitmq.exchange.name}")
    private String exchange;

    @Value("${rabbitmq.binding.routing.key}")
    private String orderRoutingKey;

    @Value("${rabbitmq.binding.email.routing.key}")
    private String emailRoutingKey;

    private RabbitTemplate rabbitTemplate;

    public OrderProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(OrderEvent orderEvent) {
        LOGGER.info(String.format("Order Event sent to RabbitMQ =>  %s", orderEvent.toString()));

        // Send on order event to order queue
        this.rabbitTemplate.convertAndSend(exchange, orderRoutingKey, orderEvent);

        // Send on order event to email queue
        this.rabbitTemplate.convertAndSend(exchange, emailRoutingKey, orderEvent);
    }

}

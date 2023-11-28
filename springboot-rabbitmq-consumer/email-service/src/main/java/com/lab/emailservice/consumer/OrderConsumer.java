package com.lab.emailservice.consumer;

import com.lab.emailservice.dto.OrderEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class OrderConsumer {
    private Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @RabbitListener(queues = "${rabbitmq.queue.email.name}")
    private void consume(OrderEvent orderEvent){
        LOGGER.info(String.format("Order Event received from RabbitMQ =>  %s", orderEvent.toString()));

        // Email service need to send email customer
    }
}

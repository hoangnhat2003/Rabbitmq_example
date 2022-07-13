package com.example.rabbitmq_adv.domain;


import com.example.rabbitmq_adv.rabbitmqcofig.Producer;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Component
public class RabbitMQSender {

    @Autowired
    private Producer producer;

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(MqMessage message) throws IOException, TimeoutException {
        producer.start(message.getExchange(), message.getQueue(), message.getRoutingKey());
        rabbitTemplate.convertAndSend(message.getExchange(), message.getRoutingKey(), message.getMessage());
        //LoggerUtil.i(TAG ,"Sending Message to the Queue : " + GsonSingleton.getInstance().toJson(message.getMessage()));
    }
}

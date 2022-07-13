package com.example.rabbitmq_adv.controller;

import com.example.rabbitmq_adv.domain.MqMessage;
import com.example.rabbitmq_adv.domain.RabbitMQSender;
import com.example.rabbitmq_adv.dto.User;
import com.example.rabbitmq_adv.rabbitmqcofig.RabbitMQConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

@RestController
public class UserController {
    @Autowired
    private RabbitMQSender rabbitMQSender;

    @PutMapping("/user")
    void userUpdate(@RequestBody User user) throws IOException, TimeoutException {
        MqMessage message = new MqMessage();
        message.setExchange(RabbitMQConfig.EXCHANGE);
        message.setQueue(RabbitMQConfig.QUEUE + "_USER");
        message.setRoutingKey(RabbitMQConfig.ROUTING);
        message.setMessage(user);
        rabbitMQSender.send(message);
    }
}
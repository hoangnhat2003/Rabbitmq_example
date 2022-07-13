package com.example.rabbitmq_adv.consumer.receiver;

import com.example.rabbitmq_adv.consumer.event.IUserEvent;
import com.example.rabbitmq_adv.dto.User;
import com.example.rabbitmq_adv.rabbitmqcofig.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitMQConfig.QUEUE + "_USER")
public class UserReceiver {
    @Autowired
    private IUserEvent event;

    @RabbitHandler
    User updateUser(User user) {
        return event.updateUser(user);
    }
}

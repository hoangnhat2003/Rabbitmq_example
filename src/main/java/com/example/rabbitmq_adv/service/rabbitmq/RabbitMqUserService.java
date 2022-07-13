package com.example.rabbitmq_adv.service.rabbitmq;

import com.example.rabbitmq_adv.consumer.event.IUserEvent;
import com.example.rabbitmq_adv.dto.User;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqUserService implements IUserEvent {

    @Override
    public User updateUser(User user) {
        System.out.println("da nhan thong diep");
        return user;
    }
}

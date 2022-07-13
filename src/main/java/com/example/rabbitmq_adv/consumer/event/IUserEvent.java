package com.example.rabbitmq_adv.consumer.event;

import com.example.rabbitmq_adv.dto.User;

public interface IUserEvent {
    User updateUser(User user);
}

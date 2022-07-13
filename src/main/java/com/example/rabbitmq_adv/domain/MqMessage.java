package com.example.rabbitmq_adv.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MqMessage {

    private String exchange;

    private String queue;

    private String routingKey;

    private Object message;
}


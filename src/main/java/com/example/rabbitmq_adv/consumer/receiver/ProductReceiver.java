package com.example.rabbitmq_adv.consumer.receiver;

import com.example.rabbitmq_adv.consumer.event.IProductEvent;
import com.example.rabbitmq_adv.dto.Product;
import com.example.rabbitmq_adv.rabbitmqcofig.RabbitMQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = RabbitMQConfig.QUEUE + "_PRODUCT")
public class ProductReceiver {

    @Autowired
    private IProductEvent event;

    @RabbitHandler
    Product updateProduct(Product product) {
        return event.updateProduct(product);
    }

}

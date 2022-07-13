package com.example.rabbitmq_adv.service.rabbitmq;

import com.example.rabbitmq_adv.consumer.event.IProductEvent;
import com.example.rabbitmq_adv.dto.Product;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqProductService implements IProductEvent {
    @Override
    public Product updateProduct(Product product) {
        return product;
    }
}

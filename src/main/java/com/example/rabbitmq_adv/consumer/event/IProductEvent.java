package com.example.rabbitmq_adv.consumer.event;

import com.example.rabbitmq_adv.dto.Product;

public interface IProductEvent {
    Product updateProduct(Product product);
}

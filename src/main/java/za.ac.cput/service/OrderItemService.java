package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.OrderItem;
import za.ac.cput.repository.OrderItemRepository;

import java.util.List;

/*
 *OrderItem:java
 *OrderItem: Service implementation Class
 * Author: Luke Duffell
 * Date: 19 May 2024
 */

@Service
public class OrderItemService implements IOrderItemService {
    private OrderItemRepository repository;

    @Autowired
    OrderItemService(OrderItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public OrderItem create(OrderItem orderItem) {
        return this.repository.save(orderItem);
    }

    @Override
    public OrderItem read(String id) {return this.repository.findById(id).orElse(null);}

    @Override
    public OrderItem update(OrderItem orderItem) {
        return this.repository.save(orderItem);
    }

    @Override
    public List<OrderItem> findAll() {
        return this.repository.findAll();
    }
}

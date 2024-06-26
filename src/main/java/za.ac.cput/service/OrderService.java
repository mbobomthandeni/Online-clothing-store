package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Order;
import za.ac.cput.repository.IOrderRepository;

import java.util.List;

@Service
public class OrderService implements IOrderService {
    private final IOrderRepository repository;

    @Autowired
    public OrderService(IOrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Order create(Order order) {
        return repository.save(order);
    }


    @Override
    public Order read(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Order update(Order order) {
        return repository.save(order);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }


    @Override
    public List<Order> findAll() {
        return repository.findAll();
    }
}

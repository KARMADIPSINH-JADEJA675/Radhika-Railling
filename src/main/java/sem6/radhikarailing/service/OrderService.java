package sem6.radhikarailing.service;

import sem6.radhikarailing.entity.OrderData;
import sem6.radhikarailing.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    public void save(OrderData order){

        repo.save(order);

    }

    public List<OrderData> getAllOrders(){

        return repo.findAll();

    }
}
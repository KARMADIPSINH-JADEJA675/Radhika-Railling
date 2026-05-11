package sem6.radhikarailing.repository;

import sem6.radhikarailing.entity.OrderData;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository
        extends JpaRepository<OrderData, Long> {

}
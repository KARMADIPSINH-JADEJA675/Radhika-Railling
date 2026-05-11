package sem6.radhikarailing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sem6.radhikarailing.entity.Product;

import java.util.List;

public interface ProductRepository
        extends JpaRepository<Product, Long> {

    List<Product>
    findByCategoryContainingIgnoreCase(String category);

}
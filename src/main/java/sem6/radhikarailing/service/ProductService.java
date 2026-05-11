package sem6.radhikarailing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sem6.radhikarailing.entity.Product;
import sem6.radhikarailing.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    // GET ALL PRODUCTS

    public List<Product> getAllProducts(){

        return repo.findAll();
    }

    // SAVE PRODUCT

    public void save(Product product){

        repo.save(product);
    }

    // DELETE PRODUCT

    public void delete(Long id){

        repo.deleteById(id);
    }

    // GET PRODUCT BY ID

    public Product getProductById(Long id){

        return repo.findById(id).orElse(null);
    }

    // GET PRODUCTS BY CATEGORY

    public List<Product> getProductsByCategory(String category){

        return repo.findByCategoryContainingIgnoreCase(category);
    }

}
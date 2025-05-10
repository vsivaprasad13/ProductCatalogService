package com.example.productcatalogservice.repos;

import com.example.productcatalogservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {
    Product save(Product product);

    @Override
    Optional<Product> findById(Long id);
    void deleteById(Long id);

    @Override
    List<Product> findAll();
}

package com.example.productcatalogservice.services;

import com.example.productcatalogservice.models.Product;
import com.example.productcatalogservice.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service("sps")

public class StorageProductService implements IProductService {

    @Autowired
    private ProductRepo productRepo;

    @Override
    public Product getProductById(Long id) {
        Optional<Product> optionalProduct = productRepo.findById(id);
        return optionalProduct.orElse(null);
    }

    @Override
    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product replaceProduct(Product input, Long id) {
        return productRepo.save(input);
    }

    @Override
    public Boolean deleteProduct(Long id) {
        Optional<Product> optionalProduct = productRepo.findById(id);
        if(optionalProduct.isPresent()) {
            productRepo.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Product createProduct(Product product) {
        Optional<Product> optionalProduct = productRepo.findById(product.getId());
        if(optionalProduct.isEmpty())
            return productRepo.save(product);
        else
            return optionalProduct.get();
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }
}

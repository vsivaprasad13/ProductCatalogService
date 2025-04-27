package com.example.productcatalogservice.controllers;

import com.example.productcatalogservice.dtos.ProductDto;
import com.example.productcatalogservice.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @GetMapping("/products/{id}")
    public ProductDto getProductDetails(@PathVariable long id){
        return new ProductDto();
    }

    @GetMapping("/products")
    public ProductDto getProducts(@RequestBody ProductDto product){
        return new ProductDto();
    }

    @PostMapping("/products/{id}")
    public void createProduct(@PathVariable long id ,@RequestBody ProductDto product){

    }

    @PutMapping("/products/{id}")
    public ProductDto updateCompleteProduct(@PathVariable long id,@RequestBody ProductDto product){
        return product;
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable long id){
        deleteProduct(id);
    }

    @PatchMapping("/products/{id}")
    public ProductDto updateProduct(@RequestBody ProductDto product){
        return product;
    }

}

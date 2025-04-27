package com.example.productcatalogservice.controllers;

import com.example.productcatalogservice.dtos.ProductDto;
import com.example.productcatalogservice.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/products/{id}")
    public ProductDto getProductDetails(@PathVariable long id){
        return new ProductDto();
    }

    @GetMapping("/products")
    public List<ProductDto> getProducts(){
        return new ArrayList<>();
    }

    @PostMapping("/products")
    public void createProduct(@RequestBody ProductDto product){

    }

    @PutMapping("/products/{id}")
    public ProductDto updateCompleteProduct(@PathVariable long id,@RequestBody ProductDto product){
        return product;
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable long id){

    }

    @PatchMapping("/products/{id}")
    public ProductDto updateProduct(@PathVariable long id,@RequestBody ProductDto product){
        return product;
    }

}

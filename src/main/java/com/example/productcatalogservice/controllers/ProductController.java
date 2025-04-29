package com.example.productcatalogservice.controllers;

import com.example.productcatalogservice.dtos.CategoryDto;
import com.example.productcatalogservice.dtos.ProductDto;
import com.example.productcatalogservice.models.Product;
import com.example.productcatalogservice.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService;

    @GetMapping("/products/{id}")
    public ProductDto getProductDetails(@PathVariable long id){
        Product product = productService.getProductById(id);
        if(product == null)
            return null;

        return from(product);

    }

    @GetMapping("/products")
    public List<ProductDto> getProducts(){
        return null;
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

//    @PatchMapping("/products/{id}")
//    public ProductDto updateProduct(@PathVariable long id,@RequestBody ProductDto product){
//        return product;
//    }

    private ProductDto from (Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setPrice(product.getPrice());
        productDto.setImageUrl(product.getImage_url());
        if(product.getCategory() != null) {
            CategoryDto categoryDto = new CategoryDto();
            categoryDto.setName(product.getCategory().getName());
            categoryDto.setId(product.getCategory().getId());
            categoryDto.setDescription(product.getCategory().getDescription());
            productDto.setCategory(categoryDto);
        }
        return productDto;
    }


}

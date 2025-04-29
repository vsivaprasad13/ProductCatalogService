package com.example.productcatalogservice.models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product extends BaseModel {

    private String name;
    private String description;
    private String image_url;
    private Double price;
    private Category category;
}

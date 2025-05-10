package com.example.productcatalogservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter

@Entity
public class Category extends BaseModel{

    private String Name;
    private String description;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}

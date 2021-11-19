package com.gk.demo.dto;

import com.gk.demo.model.Category;
import lombok.Data;

import javax.persistence.*;

@Data
public class ProductDTO {
    private long id;
    private String name;
    private int categoryId;
    private double price;
    private double weight;
    private String description;
    private String imageName;
}

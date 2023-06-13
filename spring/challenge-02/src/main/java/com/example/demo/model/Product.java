package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(schema = "products")
public class Product {
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    @Column(name = "id", nullable = false)
    private long Id;

    @Column(name = "product_name", nullable = false)
    private String ProductName;

    @Column(name = "value", nullable = false)
    @Size(min = 0)
    private Double Value;
}

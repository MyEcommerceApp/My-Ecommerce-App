package com.oil.ecommerceoilapp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 155)
    private String categoryName;

    @Column(name = "image")
    private String imageURL;

    @OneToMany(mappedBy = "category", cascade = {CascadeType.ALL, CascadeType.PERSIST})
    private List<Product> products;

    @Column(name = "enabled", nullable = false)
    private Boolean enabled;
}

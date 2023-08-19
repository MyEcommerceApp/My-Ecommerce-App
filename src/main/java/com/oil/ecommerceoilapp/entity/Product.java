package com.oil.ecommerceoilapp.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {

	@Id
	private Long id;
    
	@Column(name="product_name")
	private String productName;

	@Column(name="description")
	private String description;

	@Column(name = "price")
	private Double price;

	@Column(name = "image_url")
	private String imageURL;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id")
	private Category category;

	@Column(name = "weight")
	private Double weight;

	@Column(name = "quantity")
	private Integer quantity;

	@Column(name = "stock")
	private Boolean stock;

}

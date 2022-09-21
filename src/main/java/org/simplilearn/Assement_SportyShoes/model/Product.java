package org.simplilearn.Assement_SportyShoes.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="category.id", referencedColumnName = "category.id")
	private Categories category;
	private double price;
	private String description;
	private String imageName;
	
	
}

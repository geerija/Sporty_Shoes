package org.simplilearn.Assement_SportyShoes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

import javax.persistence.GenerationType;


@Entity
@Data

public class Categories {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="category.id")
	private int id;
	private String name;
	
	
	

}

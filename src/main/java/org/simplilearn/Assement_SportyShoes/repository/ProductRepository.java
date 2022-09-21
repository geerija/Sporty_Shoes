package org.simplilearn.Assement_SportyShoes.repository;

import java.util.List;

import org.simplilearn.Assement_SportyShoes.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	List<Product> findAllByCategory_Id(int id);
}

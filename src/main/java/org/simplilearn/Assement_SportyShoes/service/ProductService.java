package org.simplilearn.Assement_SportyShoes.service;

import java.util.List;
import java.util.Optional;

import org.simplilearn.Assement_SportyShoes.model.Product;
import org.simplilearn.Assement_SportyShoes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProduct()
	{
		return productRepository.findAll();
	}
	public void addProduct(Product product)
	{
		productRepository.save(product);
	}
	public void removeProductById(long id)
	{
		productRepository.deleteById(id);
	}

	public Optional<Product> getProductById(Long id)
	{
		return productRepository.findById(id);
	}
	public List<Product> getAllProductsByCategoryId(int id)
	{
		return productRepository.findAllByCategory_Id(id);
		
	}
}

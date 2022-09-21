package org.simplilearn.Assement_SportyShoes.service;

import java.util.List;
import java.util.Optional;

import org.simplilearn.Assement_SportyShoes.model.Categories;
import org.simplilearn.Assement_SportyShoes.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CategoryService {
	@Autowired
	CategoryRepository categoryRepository;
	public List<Categories> getAllCategory()
	{
		return categoryRepository.findAll();
	}
	public Categories addCategory(Categories category)
	{
		return categoryRepository.save(category);
	}
	public void removeCategoryById(int id)
	{
		categoryRepository.deleteById(id);
		
	}
	public Optional<Categories> getCategoryById(int id)
	{
		return categoryRepository.findById(id);
	}
	

}

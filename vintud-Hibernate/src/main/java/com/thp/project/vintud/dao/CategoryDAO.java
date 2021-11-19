package com.thp.project.vintud.dao;

import java.util.List;

import com.thp.project.vintud.entity.Category;

public interface CategoryDAO {
	
	public List<Category> getAllCategorie();
	public void createCategory(Category categorie);
	public void UpdateCategory(Category categorie);
	public boolean DeleteCategory(Category categorie);

}

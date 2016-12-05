package com.niit.upholsteryback.service;



import java.util.List;


import com.niit.upholsteryback.model.Category;



public interface CategoryDAO {

	   public List<Category> getAllCategory();
	   public  Category getCategory(int categoryid);
	   public void insertCategory(Category category);
	   public void updateCategory(Category category);
	   public void deleteCategory(int id);
	   public void deleteAllCategory(Category category);

}
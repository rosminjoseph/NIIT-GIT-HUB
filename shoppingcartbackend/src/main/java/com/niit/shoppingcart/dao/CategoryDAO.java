package com.niit.shoppingcart.dao;
import java.util.List;
import com.niit.shoppingcart.model.Category;
public interface CategoryDAO {
	public boolean save(Category category);
	public boolean update(Category category);
	public Category get(String id);
	public boolean delete(String id); 
	public List<Category> list();
	
	
	
	}


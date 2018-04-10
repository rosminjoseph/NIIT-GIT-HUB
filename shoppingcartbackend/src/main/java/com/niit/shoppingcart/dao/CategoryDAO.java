package com.niit.shoppingcart.dao;
import java.util.List;
import com.niit.shoppingcart.model.Category;
public interface CategoryDAO {
	public boolean save(Category category);
	public boolean update(Category category);
	public Category get(String emailID);
	public boolean delete(String emailID); 
	public List<Category> list();
	
	}


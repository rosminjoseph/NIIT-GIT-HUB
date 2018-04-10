package com.niit.shoppingcart.dao;
import java.util.List;
import com.niit.shoppingcart.model.Product;
public interface ProductDAO  {
	public boolean save(Product product);
	public boolean update(Product product);
	public Product get(String emailID);
	public boolean delete(String emailID); 
	public List<Product> list();
	

}

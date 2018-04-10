package com.niit.shoppingcart.dao;

import java.util.List;

import com.niit.shoppingcart.model.Supplier;

public interface SupplierDAO {
	public boolean save(Supplier supplier);
	public boolean update(Supplier supplier);
	public Supplier get(String emailID);
	public boolean delete(String emailID); 
	public List<Supplier> list();
	

}

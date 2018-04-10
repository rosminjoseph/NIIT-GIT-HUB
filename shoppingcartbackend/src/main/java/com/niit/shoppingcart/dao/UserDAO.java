package com.niit.shoppingcart.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.niit.shoppingcart.model.User;

public interface UserDAO {
	
	public User get_user(String emailID);

	public boolean save_user(User user);

	public boolean update_user(User user);

	public User validate(String emailID,String password);
	
	public List<User> list_user();
}
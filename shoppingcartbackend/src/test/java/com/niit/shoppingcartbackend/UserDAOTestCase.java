/*package com.niit.shoppingcartbackend;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;


public class UserDAOTestCase {
	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static UserDAO userDAO;
	@Autowired
	private static User user;
	@BeforeClass
	public static void init()
	{
		context=new  AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		userDAO=(UserDAO)context.getBean("userDAO");
		user=(User)context.getBean("user");
	}
	@Test
	public void saveUserTestCase()
	{
		user.setEmailID("kiran@gmail.com");
		user.setMobile("8323778439");
		user.setName("kiran");
		user.setPassword("ki@123");
		boolean status=userDAO.save(user);
		Assert.assertEquals("save user test case", true, status);
	}
	@Test
	public void updateUserTestCase()
	{
		user.setEmailID("kiran@gmail.com");
		user.setMobile("2222222222");
		boolean status=userDAO.update(user);
		assertEquals("update test case",true,status);
	}
	@Test
	public void getUserSuccessTestCase()
	{
		user=userDAO.get("kiran@gmail.com");
		assertNull("get user test case",user);
	}
	@Test
	public void getUserFailureTestCase()
	{
		user=userDAO.get("jaya@gmail.com");
		assertNull("get user test case",user);
	}
	@Test
	public void deleteUserSuccessTestCase()
	{
		boolean status=userDAO.delete("kiran@gmail.com");
		assertEquals("delete user success test case",true,status);
	}
	@Test
	public void deleteUserFailureTestCase()
	{
		boolean status=userDAO.delete("arpith@gmail.com");
		assertEquals("delete user failure test case",false,status);
		
	}
		
		public void validateCredentials()
		{
		List<User> users=userDAO.list();
		assertEquals("get all users",3,users.size());
		}
		public void validateCredentialsTestCase()
		{
			user=userDAO.validate("kiran@gmail.com","ki@123");
			assertNotNull("validate test case",user);
		}
		


}*/
 
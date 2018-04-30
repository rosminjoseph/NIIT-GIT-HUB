package com.niit.shoppingcart.daoimpl;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;
@Transactional
@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public boolean save(Category category)
	{
		try {
			
			sessionFactory.getCurrentSession().save(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean update(Category category)
	{
		try {
			sessionFactory.getCurrentSession().update(category);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public Category get(String ID)
	{
		   try {
			Category category= (Category)sessionFactory.getCurrentSession().get(Category.class,ID);
			   return category;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}
	public boolean delete(String ID)
	{
		try {
			Category category=get(ID);
			if(category==null)
			{
				return false;
			}
				sessionFactory.getCurrentSession().delete(category);
				return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		} 
	
	public List<Category> list()
	{
		
		return sessionFactory.getCurrentSession().createQuery("from Category").list();
	}

	
}




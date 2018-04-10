/*package com.niit.shoppingcart.daoimpl;
import java.sql.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;
@Transactional
@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private Product product;
	public boolean save(Product product)
	{
		try {
			
			
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
			
		}
	
	public boolean update(Product product)
	{
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	public Product get(String emailID)
	{
		   try {
			Product product= (Product)sessionFactory.getCurrentSession().get(Product.class,emailID);
			   return product;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}
	public boolean delete(String emailID)
	{
		try {
			product=get(emailID);
			if(product==null)
			{
				return false;
			}
				sessionFactory.getCurrentSession().delete(product);
				return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		} 
	
	public List<Product> list()
	{
		
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}
	public  Product validate(String emailID,String password)
	{
		return  (Product) sessionFactory.getCurrentSession().createCriteria(Product.class).add(Restrictions.eq("emailID", emailID)).add(Restrictions.eq("password", password)).uniqueResult();
		
		
	}
}*/




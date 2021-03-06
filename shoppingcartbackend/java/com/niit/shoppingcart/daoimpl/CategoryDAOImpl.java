/*package com.niit.shoppingcart.daoimpl;
import java.sql.Date;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

@Transactional
@Repository("CategoryDAO") //will create instance of categorydao and the name will us categorydaoimpl
//DAO:DATA ACCESS OBJECT

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
	public Category get(String emailID)
	{
		   try {
			Category category= (Category)sessionFactory.getCurrentSession().get(Category.class,emailID);
			   return category;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}
	public boolean delete(String emailID)
	{
		try {
			Category category=get(emailID);
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
	public  Category validate(String emailID,String password)
	{
		return  (Category) sessionFactory.getCurrentSession().createCriteria(Category.class).add(Restrictions.eq("emailID", emailID)).add(Restrictions.eq("password", password)).uniqueResult();
		
		
	}
}*/


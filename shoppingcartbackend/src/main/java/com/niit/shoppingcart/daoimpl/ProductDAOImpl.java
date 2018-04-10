package com.niit.shoppingcart.daoimpl;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
@Transactional
@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public boolean save(Product product) {
try {
			
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
		
	}

	public Product get(String emailID) {
		try {
			Product product= (Product)sessionFactory.getCurrentSession().get(Category.class,emailID);
			   return product;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}

	public boolean delete(String emailID) {
		try {
			Product product=get(emailID);
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

	public List<Product> list() {
		return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
		
	}
		

}

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
	System.out.println("In SAve Product Try ..."+product.getId()+product.getName());
			sessionFactory.getCurrentSession().save(product);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			System.out.println("In SAve Product Catch ..."+e.getMessage());
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

	public Product get(String id) {
		try {
			Product product= (Product)sessionFactory.getCurrentSession().get(Product.class,id);
			   return product;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}

	public boolean delete(String id) {
		try {
			Product product=get(id);
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
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
		
	}

	public List<Product> listbyCat(String id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Product where CID='"+id+"'").list();
	}

	


		

}

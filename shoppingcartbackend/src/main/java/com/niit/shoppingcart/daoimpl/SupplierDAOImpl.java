package com.niit.shoppingcart.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Supplier;
@Transactional
@Repository("SupplierDAO")
public class SupplierDAOImpl implements SupplierDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public boolean save(Supplier supplier) {
		try {
			
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public boolean update(Supplier supplier) {
		try {
			sessionFactory.getCurrentSession().update(supplier);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public Supplier get(String emailID) {
		 try {
				Supplier supplier= (Supplier)sessionFactory.getCurrentSession().get(Category.class,emailID);
				   return supplier;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				return null;
			}
		
	}

	public boolean delete(String emailID) {
		try {
			Supplier supplier=get(emailID);
			if(supplier==null)
			{
				return false;
			}
				sessionFactory.getCurrentSession().delete(supplier);
				return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	public List<Supplier> list() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
		
	}

}

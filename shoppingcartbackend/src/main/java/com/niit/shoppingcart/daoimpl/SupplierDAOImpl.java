package com.niit.shoppingcart.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;
@Transactional
@Repository("SupplierDAO")
public class SupplierDAOImpl implements SupplierDAO{
	@Autowired
	private SessionFactory sessionFactory;
	Transaction transaction = null;
	@Transactional
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

	public Supplier get(String id) {
		
			try {
				Supplier supplier= (Supplier)sessionFactory.openSession().get(Supplier.class,id);
				   return supplier;
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				return null;
			}
		}
	public boolean delete(String id)
	{
		try {
			Supplier supplier=get(id);
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
		return sessionFactory.getCurrentSession().createQuery("from Supplier").list();
		
		
	}


	@Transactional
	public boolean delete(Supplier su) {
		Session s=null;
		try 
		{
			s=sessionFactory.getCurrentSession();
		}
		catch (HibernateException e1)
		{
			s=sessionFactory.openSession();
		}
		try
		{
			transaction = s.beginTransaction();
			s.delete(su);
			transaction.commit();
			return true;
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			if(transaction != null) {
                transaction.rollback();
		 }
			return false;
		}
		finally 
		 {
	       if (s.isOpen())
	       {
	           s.close();
	        }
	     }
		
	}

}

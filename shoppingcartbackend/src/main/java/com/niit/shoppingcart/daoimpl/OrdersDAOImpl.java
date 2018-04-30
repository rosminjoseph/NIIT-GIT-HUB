package com.niit.shoppingcart.daoimpl;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingcart.dao.OrdersDAO;
import com.niit.shoppingcart.model.Orders;
@Transactional
@Repository("ordersDAO")
public class OrdersDAOImpl implements OrdersDAO
{
	@Autowired
	private SessionFactory sessionfactory;
	
	public boolean save_order(Orders orders)
	{
		try {
			
					sessionfactory.getCurrentSession().save(orders);
					return true;
				} catch (HibernateException e) {
					// TODO Auto-generated catch block
					return false;
				}
	}

	

}

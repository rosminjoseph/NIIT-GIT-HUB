package com.niit.shoppingcart.daoimpl;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

@Repository("UserDAO")
@Transactional
public class UserDAOImpl implements UserDAO{
	@Autowired
	private SessionFactory sessionfactory;
	public UserDAOImpl (SessionFactory sessionfactory) {
		super();
		this.sessionfactory = sessionfactory;
	}

	@Transactional
	public User get_user(String id) 
	{
		System.out.println("in get user----------"+id);
		return (User) sessionfactory.openSession().load(User.class,id);
	}

	@Transactional
	public boolean save_user(User user)
	{
		System.out.println("in impl");
		
		try {
			sessionfactory.getCurrentSession().save(user);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	

	@Transactional
	public User validate(String id,String password)
	{
		return(User)sessionfactory.getCurrentSession().createCriteria(User.class).add(Restrictions.eq("emailID",id)).add(Restrictions.eq("password",password)).uniqueResult();
	}

	public boolean update_user(User user) {
		try {
			sessionfactory.getCurrentSession().update(user);
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	public List<User> list_user() {
		return (List<User>) sessionfactory.getCurrentSession().createQuery("from User").list();
	}
	

}



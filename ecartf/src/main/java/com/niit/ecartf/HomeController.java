package com.niit.ecartf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;

@Controller
public class HomeController 
{
	@Autowired
	private ProductDAO productdao;
	@Autowired
	private CategoryDAO categorydao;
	@Autowired
	private SupplierDAO supplierdao;
	
	@RequestMapping("/hello")
	String index()
	{
		return "home";
	}
	@RequestMapping("/")
	public ModelAndView home()
	{
	ModelAndView mv=new ModelAndView("home");
	List<Category> categories=categorydao.list();
	mv.addObject("categories", categories);
	List<Product> products=productdao.list();
	mv.addObject("products", products);
	return mv;
	}
	@RequestMapping("/error")
	public ModelAndView error()
	{
	ModelAndView mv=new ModelAndView("error");
	List<Category> categories=categorydao.list();
	mv.addObject("categories", categories);
	List<Product> products=productdao.list();
	mv.addObject("products", products);
	return mv;
	}
	@RequestMapping("/productlist")
	public ModelAndView plist(@RequestParam("id") String id)
	{
	ModelAndView mv=new ModelAndView("Productlist");
	List<Category> categories=categorydao.list();
	mv.addObject("categories", categories);
	
	List<Product> lip=productdao.listbyCat(id);
	mv.addObject("products", lip);
	return mv;
	}
	
	
	@RequestMapping("/adminP")
	public ModelAndView admin(@RequestParam("msg") String msg)
	{
	ModelAndView mv=new ModelAndView("admin");
	List<Category> categories=categorydao.list();
	mv.addObject("categories", categories);
	try
	{
	List<Supplier> suppliers=supplierdao.list();
	mv.addObject("suppliers", suppliers);
	}
	catch(Exception e)
	{
		System.out.println("-----------ERRORller in contro :"+e.getMessage());
	}
	List<Product> products=productdao.list();
	mv.addObject("products", products);
	mv.addObject("msg", msg);
	return mv;
	}
	

}

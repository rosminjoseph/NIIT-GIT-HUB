package com.niit.ecartf;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.User;

@Controller

public class UserController {
	@Autowired
	private UserDAO userdao;
	@Autowired
	private CategoryDAO categorydao;

	/*@RequestMapping("/logout")
	public ModelAndView logout()
	{
		//System.out.println("In validate");
		ModelAndView mv=new ModelAndView("home");
		httpsession.invalidate();
		mv.addObject("Logoutmessage","Successfully logged out");
		return mv;
	}*/


	@RequestMapping("/reg")
	public ModelAndView register(@RequestParam("phnno")String phnno,@RequestParam("username")String username,@RequestParam("id")String emailid,@RequestParam("password")String password)
	//public ModelAndView register(@RequestBody User user)
	{
		ModelAndView mv=new ModelAndView("redirect:/login");
		User user=new User();
		user.setEmailID(emailid);
		user.setMobile(phnno);
		user.setName(username);
		user.setPassword(password);
		user.setRole("USER");
		List<Category> categories=categorydao.list();
		mv.addObject("categories", categories);
		//user.setRegisteredDate(new Date(System.currentTimeMillis()));
		
		
		//System.out.println(name+"---"+password+"---"+m+"---"+mail);
		try
		{
		if(userdao.save_user(user))
		{
			mv.addObject("error","Successfully Registered..");
		}
		else
		{
			mv.addObject("error","Not Registered..try again");
		}
		}
		catch(Exception e)
		{
			mv.addObject("error","Not Registered..Email ID already exist");
		}
		return mv;
	}
	@RequestMapping("/register")
	String nuser(Model mv)
	{
		

		List<Category> categories=categorydao.list();
		mv.addAttribute("categories", categories);
		return "register";
	}
	
	@RequestMapping("/login")
	String euser(Model m,@RequestParam("error")String error)
	{
		List<Category> categories = categorydao.list();
		m.addAttribute("categories", categories);
		m.addAttribute("error", error);
		return "login";
		
	}
	@RequestMapping("/homecss")
	String css()
	{
		return "homecss";
	}

	
	}






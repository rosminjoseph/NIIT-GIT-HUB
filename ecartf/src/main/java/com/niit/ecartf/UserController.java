package com.niit.ecartf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.User;

@Controller

public class UserController {
	@Autowired
	private UserDAO userdao;
	
	@RequestMapping("/log")
	public ModelAndView validate(@RequestParam("username")String username,@RequestParam("password")String password)
	{
		//System.out.println("In validate");
		ModelAndView mv=new ModelAndView("home");
		if(userdao.validate(username,password)==null )
		{
			mv.addObject("Errormessage","Invalid credential,plz try again");
			
		}
		else
		{
			mv.addObject("Welcomemessage","Welcome Mr./Ms. "+username);
		}
		return mv;
	}
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
	public ModelAndView register(@RequestParam("phnno")String phnno,@RequestParam("username")String username,@RequestParam("emailid")String emailid,@RequestParam("password")String password)
	//public ModelAndView register(@RequestBody User user)
	{
		ModelAndView mv=new ModelAndView("home");
		User user=new User();
		user.setEmailID(emailid);
		user.setMobile(phnno);
		user.setName(username);
		user.setPassword(password);
		user.setRole('c');
		//user.setRegisteredDate(new Date(System.currentTimeMillis()));
		
		
		//System.out.println(name+"---"+password+"---"+m+"---"+mail);
		if(userdao.save_user(user))
		{
			mv.addObject("successmessage","Successfully Registered..");
		}
		else
		{
			mv.addObject("failuremessage","Not Registered..try again");
		}
		return mv;
	}
	@RequestMapping("/register")
	String nuser()
	{
		return "register";
	}
	@RequestMapping("/login")
	String euser()
	{
		return "login";
	}
}




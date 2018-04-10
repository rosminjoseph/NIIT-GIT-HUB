package com.niit.ecartf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;
@Controller
public class CategoryController {
	@Autowired
	private CategoryDAO categorydao;
	
	/*@RequestMapping("/log")
	public ModelAndView validate(@RequestParam("categoryname")String categoryname,@RequestParam("password")String password)
	{
		//System.out.println("In validate");
		ModelAndView mv=new ModelAndView("home");
		if(categorydao.validate(categoryname,password)==null )
		{
			mv.addObject("Errormessage","Invalid credential,plz try again");
			
		}
		else
		{
			mv.addObject("Welcomemessage","Welcome Mr./Ms. "+categoryname);
		}
		return mv;
	}*/
	/*@RequestMapping("/logout")
	public ModelAndView logout()
	{
		//System.out.println("In validate");
		ModelAndView mv=new ModelAndView("home");
		httpsession.invalidate();
		mv.addObject("Logoutmessage","Successfully logged out");
		return mv;
	}*/


	@RequestMapping("/cat")
	public ModelAndView createCategory(@RequestParam("name")String name,@RequestParam("description")String description,@RequestParam("id")String id)
	//public ModelAndView register(@RequestBody Category category)
	{
		ModelAndView mv=new ModelAndView("home");
		Category category=new Category();
		category.setId(id);
		category.setName(name);
		category.setDescription(description);
		
		//category.setRegisteredDate(new Date(System.currentTimeMillis()));
		
		
		//System.out.println(name+"---"+password+"---"+m+"---"+mail);
		if (categorydao.save(category))
		{
			mv.addObject("successmessage","Successfully created category..");
		}
		else
		{
			mv.addObject("failuremessage","Not created category..try again");
		}
		return mv;
	}
	
	@RequestMapping("/Category")	
	String index()
	{
	return "category";
	}
}




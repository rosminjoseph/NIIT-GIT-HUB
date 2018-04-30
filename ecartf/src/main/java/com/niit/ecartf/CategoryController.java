package com.niit.ecartf;
import java.util.List;
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
	
	


	@RequestMapping("/cat")
	public ModelAndView createCategory(@RequestParam("id")String id,@RequestParam("name")String name,@RequestParam("description")String description)
	//public ModelAndView register(@RequestBody Category category)
	{
		ModelAndView mv=new ModelAndView("redirect:/adminP");
		Category category=new Category();
		category.setId(id);
		category.setName(name);
		category.setDescription(description);
	
		
		//category.setRegisteredDate(new Date(System.currentTimeMillis()));
		
		
		//System.out.println(name+"---"+password+"---"+m+"---"+mail);
		if (categorydao.save(category))
		{
			mv.addObject("msg","Successfully created category..");
		}
		else
		{
			mv.addObject("msg","Not created category..try again");
		}
		return mv;
	}
	
	@RequestMapping("/Category")	
	public ModelAndView category()
	{
		ModelAndView mv=new ModelAndView("category");
		List<Category> categories=categorydao.list();
		mv.addObject("categories", categories);
		return mv;
	}

	@RequestMapping("/deleteC")
	public ModelAndView deleteCategory(@RequestParam("id")String id)
	{
		System.out.println("in delete cat");
		ModelAndView mv=new ModelAndView("redirect:/adminP");
		try {
			categorydao.delete(id);
			mv.addObject("msg","Category deleted");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			mv.addObject("msg","Category couldn't deleted");
		}
		System.out.println("exiting delete cat");
		return mv;
	}
	@RequestMapping("/editC")
	public ModelAndView editCategory(@RequestParam("id")String id)
	{
		ModelAndView mv=new ModelAndView("editcat");	
		Category category=categorydao.get(id);
		mv.addObject("Category",category);
		return mv;
	}

	
	@RequestMapping("/Upcat")
	public ModelAndView updateCategory(@RequestParam("id")String id,@RequestParam("name")String name,@RequestParam("description")String description)
	{
		ModelAndView mv=new ModelAndView("redirect:/adminP");
		Category category=categorydao.get(id);
		category.setName(name);
		category.setDescription(description);
		if(categorydao.update(category))
		{
			mv.addObject("msg","successfully updated category");
		}
		else
		{
			mv.addObject("msg","couldn't updated category..try again");
		}
		return mv;
		
	}
	}
	





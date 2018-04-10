package com.niit.ecartf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Product;
@Controller
public class ProductController {
	@Autowired
	private ProductDAO productdao;
	@Autowired
	private CategoryDAO categorydao;
	private SupplierDAO supplierdao;
	
	@RequestMapping("/pro")
	public ModelAndView createProduct(@RequestParam("id")String id,@RequestParam("name")String name,@RequestParam("description")String description, @RequestParam("categoryID")String categoryID,@RequestParam("supplierID")String supplierID)
	//public ModelAndView register(@RequestBody Category category)
	{
		ModelAndView mv=new ModelAndView("home");
		Product product=new Product();
		product.setId(id);
		product.setName(name);
		product.setDescription(description);
		product.setCategoryID(categorydao.get(categoryID));
		product.setSupplierID(supplierdao.get(supplierID));
		//category.setRegisteredDate(new Date(System.currentTimeMillis()));
		
		
		//System.out.println(name+"---"+password+"---"+m+"---"+mail);
		if (productdao.save(product))
		{
			mv.addObject("successmessage","Successfully created product..");
		}
		else
		{
			mv.addObject("failuremessage","Not created product..try again");
		}
		return mv;
	}
	@RequestMapping("/product")


	String index()
	{
	return "product";
	}

}

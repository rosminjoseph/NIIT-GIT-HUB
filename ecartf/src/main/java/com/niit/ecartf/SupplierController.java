package com.niit.ecartf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;

@Controller
public class SupplierController 
{
@Autowired
private SupplierDAO supplierdao;

@RequestMapping("/sup")
public ModelAndView createSupplier(@RequestParam("name")String name,@RequestParam("address")String address,@RequestParam("id")String id)
//public ModelAndView register(@RequestBody Category category)
{
	ModelAndView mv=new ModelAndView("home");
	Supplier supplier=new Supplier();
	supplier.setId(id);
	supplier.setName(name);
	supplier.setAddress(address);
	
	//category.setRegisteredDate(new Date(System.currentTimeMillis()));
	
	
	//System.out.println(name+"---"+password+"---"+m+"---"+mail);
	if (supplierdao.save(supplier))
	{
		mv.addObject("successmessage","Successfully created supplier..");
	}
	else
	{
		mv.addObject("failuremessage","Not created supplier..try again");
	}
	return mv;
}
@RequestMapping("/supplier")


String index()
{
return "supplier";
}
}

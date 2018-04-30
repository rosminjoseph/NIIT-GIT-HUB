package com.niit.ecartf;
import java.util.List;
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
	ModelAndView mv=new ModelAndView("redirect:/adminP");
	Supplier supplier=new Supplier();
	supplier.setId(id);
	supplier.setName(name);
	supplier.setAddress(address);
	
	System.out.println("Supplier Object Created : "+supplier);
	
	
	//category.setRegisteredDate(new Date(System.currentTimeMillis()));
	
	
	//System.out.println(name+"---"+password+"---"+m+"---"+mail);
	if (supplierdao.save(supplier))
	{
		mv.addObject("msg","Successfully created supplier..");
	}
	else
	{
		mv.addObject("msg","Not created supplier..try again");
	}
	return mv;
}
@RequestMapping("/supplier")
public ModelAndView supplier()
{
	ModelAndView mv=new ModelAndView("supplier");
	List<Supplier> suppliers=supplierdao.list();
	mv.addObject("suppliers", suppliers);
	return mv;

}

@RequestMapping("/deleteS")
public ModelAndView deleteSupplier(@RequestParam("id")String id)
{
	System.out.println("in delete sup");
	ModelAndView mv=new ModelAndView("redirect:/adminP");
	try {
		
		Supplier supplier=supplierdao.get(id);
		if(supplierdao.delete(supplier))
		{
		
		mv.addObject("msg", " Supplier Deleted Successfully");
		}
		else
		{
			mv.addObject("msg","Supplier couldn't deleted");
		}
	} catch (Exception e) {
		System.out.println(e.getMessage());
		mv.addObject("msg","Error : Supplier couldn't deleted");
	}
	System.out.println("exiting delete sup");
	return mv;
}

@RequestMapping("/editS")
public ModelAndView editSupplier(@RequestParam("id")String id)
{
	ModelAndView mv=new ModelAndView("editsup");	
	Supplier supplier=supplierdao.get(id);
	mv.addObject("Supplier",supplier);
	return mv;
}
@RequestMapping("/Upsup")
public ModelAndView updateSupplier(@RequestParam("id")String id,@RequestParam("name")String name,@RequestParam("address")String address)
{
	ModelAndView mv=new ModelAndView("redirect:/adminP");
	Supplier supplier=new Supplier();
	supplier.setId(id);
	supplier.setName(name);
	supplier.setAddress(address);
	if(supplierdao.update(supplier))
	{
		mv.addObject("msg","successfully updated supplier");
	}
	else
	{
		mv.addObject("msg","couldn't updated supplier..try again");
	}
	return mv;
	

}
}






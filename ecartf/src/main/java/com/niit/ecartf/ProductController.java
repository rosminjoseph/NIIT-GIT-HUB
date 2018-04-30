package com.niit.ecartf;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;
@Controller
public class ProductController {
	@Autowired
	private ProductDAO productdao;
	@Autowired
	private CategoryDAO categorydao;
	@Autowired
	private SupplierDAO supplierdao;
	
	@RequestMapping("/pro")
	public ModelAndView createProduct(@RequestParam("id")String id,@RequestParam("name")String name,@RequestParam("description")String description, @RequestParam("categoryID")String categoryID,@RequestParam("supplierID")String supplierID,@RequestParam("price")String price,@RequestParam("stock")int stock,@RequestParam("pic")MultipartFile file)
	//public ModelAndView register(@RequestBody Category category)
	{
		ModelAndView mv=new ModelAndView("redirect:/adminP");
		/*System.out.println("supplier ID"+supplierID);*/
		Product product=new Product();
		product.setId(id);
		product.setName(name);
		product.setDescription(description);
		Category c=categorydao.get(categoryID);
		product.setCategoryID(c);
		Supplier s=supplierdao.get(supplierID);
		product.setSupplierID(s);
		product.setPrice(price);
		product.setStock(stock);
		
		//category.setRegisteredDate(new Date(System.currentTimeMillis()));
		
		
		//System.out.println(name+"---"+password+"---"+m+"---"+mail);
		if (productdao.save(product))
		{
			mv.addObject("msg","Successfully created product..");
			  String filepath ="D:/sheela/ecartf/src/main/webapp/resources/images/pid" +product.getId()+".jpg";
				
				System.out.println(filepath);
				try {
					byte imagebyte[] = file.getBytes();
					BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath));
					fos.write(imagebyte);
					fos.close();
					} catch (IOException e) {
					e.printStackTrace();
					} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				System.out.print(product);
		}
		else
		{
			mv.addObject("msg","Not created product..try again");
		}
		return mv;
	}
	@RequestMapping("/product")
	public ModelAndView product()
	{
	ModelAndView mv=new ModelAndView("product");
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
	return mv;
	}

@RequestMapping("/deleteP")
public ModelAndView deleteProduct(@RequestParam("id")String id)
{
	System.out.println("in delete pro");
	ModelAndView mv=new ModelAndView("redirect:/adminP");
	try {
		
		
		productdao.delete(id);
		mv.addObject("msg","product deleted");
	} catch (Exception e) {
		System.out.println(e.getMessage());
		mv.addObject("msg","product couldn't deleted");
	}
	System.out.println("exiting delete pro");
	return mv;
}


@RequestMapping("/editP")
public ModelAndView editSupplier(@RequestParam("id")String id)
{
	
		ModelAndView mv=new ModelAndView("editpro");	
		Product product=productdao.get(id);
		mv.addObject("Product",product);
		List<Category> categories=categorydao.list();
		mv.addObject("categories", categories);
		List<Supplier> suppliers=supplierdao.list();
		mv.addObject("suppliers", suppliers);
		return mv;
		
}

@RequestMapping("/Uppro")
public ModelAndView updateProduct(@RequestParam("id")String id,@RequestParam("name")String name,@RequestParam("description")String description,@RequestParam("categoryID")String categoryID,@RequestParam("supplierID")String supplierID,@RequestParam("price")String price,@RequestParam("stock")int stock,@RequestParam("pic")MultipartFile file)
{
	ModelAndView mv=new ModelAndView("redirect:/adminP");
	Product product=productdao.get(id);
	product.setId(id);
	product.setName(name);
	product.setDescription(description);
	product.setCategoryID(categorydao.get(categoryID));
	product.setSupplierID(supplierdao.get(supplierID));
	product.setPrice(price);
	product.setStock(stock);
	if(productdao.update(product))
	{
		mv.addObject("msg","successfully updated product");
		if(file.getName()!=null)
		{
		 String filepath ="D:/sheela/ecartf/src/main/webapp/resources/images/pid" +product.getId()+".jpg";
			
			System.out.println(filepath);
			try {
				byte imagebyte[] = file.getBytes();
				BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath));
				fos.write(imagebyte);
				fos.close();
				} catch (IOException e) {
				e.printStackTrace();
				} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
		}
			System.out.print(product);
		
	}
	else
	{
		mv.addObject("msg","couldn't updated product..try again");
	}
	return mv;
	
}
	@RequestMapping("/prodet")
	public ModelAndView productDetails(@RequestParam("id")String id)
	{
	
			ModelAndView mv=new ModelAndView("prodet");
			Product product=new Product();
			product=productdao.get(id);
			mv.addObject("product", product);
			List<Category> categories=categorydao.list();
			mv.addObject("categories", categories);
			return mv;
	}

}
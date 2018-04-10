/*package com.niit.shoppingcartbackend;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import java.util.List;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;
public class ProductDAOTestCase {
	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static ProductDAO productDAO;
	@Autowired
	private static Product product;
	@BeforeClass
	public static void init()
	{
		context=new  AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		productDAO=(ProductDAO)context.getBean("productDAO");
		product=(Product)context.getBean("product");
	}
	@Test
	public void saveProductTestCase()
	{
		product=new Product(null, null, null, null);
		product.setId("Lenovo-001");
		product.setName("Lenovo-product");
		product.setDescription("This is Lenovo product");
		product.setCategoryID("Elec-001");
		boolean status=productDAO.save(product);
		Assert.assertEquals("save product test case", true, status);
	}
	@Test
	public void updateProductTestCase()
	{
		product.setId("Lenovo-001");
		product.setName("Lenovo-product");
		product.setDescription("This is Lenovo product");
		product.setCategoryID("Elec-001");
		boolean status=productDAO.update(product);
		assertEquals("update test case",true,status);
	}
	@Test
	public void getProductSuccessTestCase()
	{
		product=productDAO.get("kiran@gmail.com");
		assertNull("get product test case",product);
	}
	@Test
	public void getProductFailureTestCase()
	{
		product=productDAO.get("jaya@gmail.com");
		assertNull("get product test case",product);
	}
	@Test
	public void deleteProductSuccessTestCase()
	{
		boolean status=productDAO.delete("kiran@gmail.com");
		assertEquals("delete product success test case",true,status);
	}
	@Test
	public void deleteProductFailureTestCase()
	{
		boolean status=productDAO.delete("arpith@gmail.com");
		assertEquals("delete product failure test case",false,status);
		
	}
		
		public void validateCredentials()
		{
		List<Product> products=productDAO.list();
		assertEquals("get all products",3,products.size());
		}
		public void validateCredentialsTestCase()
		{
			
			assertNotNull("validate test case",product);
		}
		


}*/
 



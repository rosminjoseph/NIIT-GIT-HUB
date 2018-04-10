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
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Supplier;
public class SupplierDAOTestCase {
	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static SupplierDAO supplierDAO;
	@Autowired
	private static Supplier supplier;
	@BeforeClass
	public static void init()
	{
		context=new  AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		supplier=(Supplier)context.getBean("supplier");
	}
	@Test
	public void saveSupplierTestCase()
	{
		supplier=new Supplier();
		supplier.setId("SUP-001");
		supplier.setName("Bigc");
		supplier.setAddress("NH33,chennai");
		boolean status=supplierDAO.save(supplier);
		Assert.assertEquals("save supplier test case", true, status);
	}
	@Test
	public void updateSupplierTestCase()
	{
		supplier.setId("SUP-001");
		supplier.setName("Bigc");
		supplier.setAddress("NH33,chennai");
		boolean status=supplierDAO.update(supplier);
		assertEquals("update test case",true,status);
	}
	@Test
	public void getSupplierSuccessTestCase()
	{
		supplier=supplierDAO.get("kiran@gmail.com");
		assertNull("get supplier test case",supplier);
	}
	@Test
	public void getSupplierFailureTestCase()
	{
		supplier=supplierDAO.get("jaya@gmail.com");
		assertNull("get supplier test case",supplier);
	}
	@Test
	public void deleteSupplierSuccessTestCase()
	{
		boolean status=supplierDAO.delete("kiran@gmail.com");
		assertEquals("delete supplier success test case",true,status);
	}
	@Test
	public void deleteSupplierFailureTestCase()
	{
		boolean status=supplierDAO.delete("arpith@gmail.com");
		assertEquals("delete supplier failure test case",false,status);
		
	}
		
		public void validateCredentials()
		{
		List<Supplier> suppliers=supplierDAO.list();
		assertEquals("get all suppliers",3,suppliers.size());
		}
		public void validateCredentialsTestCase()
		{
			
			assertNotNull("validate test case",supplier);
		}
		


}*/
 



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
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;
public class CategoryDAOTestCase {
	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static CategoryDAO categoryDAO;
	@Autowired
	private static Category category;
	@BeforeClass
	public static void init()
	{
		context=new  AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		category=(Category)context.getBean("category");
	}
	@Test
	public void saveCategoryTestCase()
	{
		category=new Category();
		category.setId("Elec-001");
		category.setName("Electronics");
		category.setDescription("This is Electronics category");
		boolean status=categoryDAO.save(category);
		Assert.assertEquals("save category test case", true, status);
	}
	@Test
	public void updateCategoryTestCase()
	{
		category.setId("Elec-001");
		category.setName("Electronics");
		category.setDescription("This is Electronics category");
		boolean status=categoryDAO.update(category);
		assertEquals("update test case",true,status);
	}
	@Test
	public void getCategorySuccessTestCase()
	{
		category=categoryDAO.get("kiran@gmail.com");
		assertNull("get category test case",category);
	}
	@Test
	public void getCategoryFailureTestCase()
	{
		category=categoryDAO.get("jaya@gmail.com");
		assertNull("get category test case",category);
	}
	@Test
	public void deleteCategorySuccessTestCase()
	{
		boolean status=categoryDAO.delete("kiran@gmail.com");
		assertEquals("delete category success test case",true,status);
	}
	@Test
	public void deleteCategoryFailureTestCase()
	{
		boolean status=categoryDAO.delete("arpith@gmail.com");
		assertEquals("delete category failure test case",false,status);
		
	}
		
		public void validateCredentials()
		{
		List<Category> categorys=categoryDAO.list();
		assertEquals("get all categorys",3,categorys.size());
		}
		public void validateCredentialsTestCase()
		{
			
			assertNotNull("validate test case",category);
		}

		
		}*/
 


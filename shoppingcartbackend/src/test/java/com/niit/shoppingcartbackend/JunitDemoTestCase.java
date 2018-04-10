/*package com.niit.shoppingcartbackend;


import org.hibernate.annotations.CreationTimestamp;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;
import junit.framework.TestCase;

@SuppressWarnings("unused")
public class JunitDemoTestCase extends TestCase {
	private static JunitDemo junitDemo;
	@BeforeClass
	public static void init()
	{
		System.out.println("creating instance junitDemo");
		junitDemo=new JunitDemo();
	}
	@AfterClass
	public static void close()
	{
		junitDemo=null;
	}
	@Test
	public void addTestCase()
	{
		int result=junitDemo.add(10,20);
		Assert.assertEquals("add test case", 30, result);
	} 
	public void CompareTestCase()
	{
		int big=junitDemo.big(10,20);
		Assert.assertEquals("compare test case", 20, big);
	}

}
*/
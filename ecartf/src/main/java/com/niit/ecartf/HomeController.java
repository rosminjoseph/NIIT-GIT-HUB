package com.niit.ecartf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/hello")
	String index()
	{
		return "home";
	}
	@RequestMapping("/")
	String home()
	{
		return "home";
	}

}

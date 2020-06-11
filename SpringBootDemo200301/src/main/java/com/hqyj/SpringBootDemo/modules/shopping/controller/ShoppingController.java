package com.hqyj.SpringBootDemo.modules.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shopping")
public class ShoppingController {

	/**
	 * 127.0.0.1/shopping/home
	 */
	@RequestMapping("/home")
	public String testPage() {
		return "shoppingIndex";
	}
}

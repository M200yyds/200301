package com.hqyj.SpringBootDemo.modules.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	/**
	 * 127.0.0.1:8080/test/desc
	 */
	@RequestMapping("/test/desc")
	@ResponseBody
	public String testDesc() {
		return "This is test module desc.";
	}
}

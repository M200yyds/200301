package com.hqyj.SpringBootDemo.modules.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqyj.SpringBootDemo.modules.test.vo.ApplicationTest;

@Controller
public class TestController {
	
	@Value("${server.port}")
	private int port;
	@Value("${com.thornBird.name}")
	private String name;
	@Value("${com.thornBird.age}")
	private int age;
	@Value("${com.thornBird.desc}")
	private String desc;
	@Value("${com.thornBird.random}")
	private String random;
	
	@Autowired
	private ApplicationTest applicationTest;
	
	/**
	 * 127.0.0.1:8080/test/config
	 */
	@RequestMapping("/test/config")
	@ResponseBody
	public String configInfo() {
		StringBuffer sb = new StringBuffer();
		sb.append(port).append("----")
			.append(name).append("----")
			.append(age).append("----")
			.append(desc).append("----")
			.append(random).append("----").append("<br>");
		
		sb.append(applicationTest.getName1()).append("----")
			.append(applicationTest.getAge1()).append("----")
			.append(applicationTest.getDesc1()).append("----")
			.append(applicationTest.getRandom1()).append("<br>");
		
		return sb.toString();
	}

	/**
	 * 127.0.0.1:8080/test/desc
	 */
	@RequestMapping("/test/desc")
	@ResponseBody
	public String testDesc() {
		return "This is test module desc.112233";
	}
}

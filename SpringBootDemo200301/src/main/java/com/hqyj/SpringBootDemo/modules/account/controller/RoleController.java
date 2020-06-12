package com.hqyj.SpringBootDemo.modules.account.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hqyj.SpringBootDemo.modules.account.entity.Role;
import com.hqyj.SpringBootDemo.modules.account.service.RoleService;

@RestController
@RequestMapping("/api")
public class RoleController {
	
	@Autowired
	private RoleService roleService;

	/**
	 * 127.0.0.1/api/roles
	 */
	@RequestMapping("/roles")
	List<Role> getRoles() {
		return roleService.getRoles();
	}
}

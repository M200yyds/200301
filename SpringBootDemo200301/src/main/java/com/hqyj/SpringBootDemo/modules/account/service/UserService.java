package com.hqyj.SpringBootDemo.modules.account.service;

import com.github.pagehelper.PageInfo;
import com.hqyj.SpringBootDemo.modules.account.entity.User;
import com.hqyj.SpringBootDemo.modules.common.vo.Result;
import com.hqyj.SpringBootDemo.modules.common.vo.SearchVo;

public interface UserService {

	User getUserByUserName(String userName);
	
	Result<User> login(User user);
	
	PageInfo<User> getUsersBySearchVo(SearchVo searchVo);
	
	User getUserByUserId(int userId);
	
	Result<Object> deleteUser(int userId);
	
	Result<User> editUser(User user);
}

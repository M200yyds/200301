package com.hqyj.SpringBootDemo.modules.account.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import com.hqyj.SpringBootDemo.modules.account.entity.User;

@Mapper
public interface UserDao {

	@Insert("insert into user (user_name, password, create_date) "
			+ "values (#{userName}, #{password}, #{createDate})")
	@Options(useGeneratedKeys = true, keyColumn = "user_id", keyProperty = "userId")
	void insertUser(User user);
	
	@Select("select * from user where user_name = #{userName}")
	User getUserByUserName(String userName);
}

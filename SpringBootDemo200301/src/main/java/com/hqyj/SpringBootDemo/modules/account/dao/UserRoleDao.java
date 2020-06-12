package com.hqyj.SpringBootDemo.modules.account.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleDao {

	@Delete("delete from user_role where user_id = #{userId}")
	void deleteRolesByUserId(int userId);
	
	@Insert("insert into user_role (user_id, role_id) values (#{userId}, #{roleId})")
	void insertUserRole(int userId, int roleId);
}

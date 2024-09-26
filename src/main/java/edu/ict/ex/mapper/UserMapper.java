package edu.ict.ex.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import edu.ict.ex.vo.UserVO;

@Mapper
public interface UserMapper {
	
	UserVO getUser(String username);
	
	@Insert("insert into users(username,password) VALUES (#{username},#{password})")
	int insertUser(UserVO userVO);
	   
	@Insert("insert into authorities(username,authority) values(#{username},'ROLE_USER')")
	int insertAuthorities(UserVO userVO);
	
}

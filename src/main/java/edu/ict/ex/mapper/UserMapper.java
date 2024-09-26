package edu.ict.ex.mapper;

import org.apache.ibatis.annotations.Mapper;

import edu.ict.ex.vo.UserVO;

@Mapper
public interface UserMapper {
	
	UserVO getUser(String username);
	
	int insertUser(UserVO userVO);
	int insertAuthorities(UserVO userVO);
	
}

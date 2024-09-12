package edu.ict.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.ict.ex.vo.EmpVO;

@Mapper
public interface EmpMapper {
	
	public List<EmpVO> getList();
	
}

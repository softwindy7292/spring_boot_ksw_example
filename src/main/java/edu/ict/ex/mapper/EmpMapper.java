package edu.ict.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.ict.ex.vo.DeptVO;
import edu.ict.ex.vo.EmpVO;

@Mapper
public interface EmpMapper {
	
	List<EmpVO> empList();
	
	List<DeptVO> deptList();

	void join(EmpVO empVO);
	
}

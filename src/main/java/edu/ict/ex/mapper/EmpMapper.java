package edu.ict.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.DeptEmpVO;
import edu.ict.ex.vo.DeptVO;
import edu.ict.ex.vo.EmpVO;
import edu.ict.ex.vo.SalgradeDeptEmpVO;

@Mapper
public interface EmpMapper {
	
	List<EmpVO> empList();
	
	List<DeptVO> deptList();
	
	// 조인 1번
	List<EmpVO> empDeptList();
	
	// 조인 2번
	List<DeptEmpVO> deptEmpList();
	
	// 조인 문제
	List<SalgradeDeptEmpVO> deptEmpSalgradeList();

	void join(EmpVO empVO);
	
	int getTotalCount();
	
	List<EmpVO> getListWithPaging(Criteria cri);
	
}

package edu.ict.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.DeptEmpVO;
import edu.ict.ex.vo.DeptVO;
import edu.ict.ex.vo.EmpDeptSalgradeVO;
import edu.ict.ex.vo.EmpDeptVO;
import edu.ict.ex.vo.EmpVO;
import edu.ict.ex.vo.SalgradeDeptEmpVO;
import edu.ict.ex.vo.join.EmpSalgradeVO;

@Mapper
public interface EmpMapper {
	
	List<EmpVO> empList();
	
	List<DeptVO> deptList();
	
	// 조인 1번
	List<EmpVO> empDeptList();
	
	// 조인 2번
	List<DeptEmpVO> deptEmpList();
	
	// 조인 문제
	List<SalgradeDeptEmpVO> salgradeDeptEmpList();
	
	// 1대1 문제
	List<EmpDeptSalgradeVO> empDeptSalgradeList();
	
	// 조인 1대1
	List<EmpDeptVO> empOneDeptList();
	
	// 조인 쌤 방법
	List<EmpSalgradeVO> empSalgrade();
	
	// 쌤 방법으로 문제
	List<EmpDeptSalgradeVO> empDeptSalgrade();

	int join(EmpVO empVO);
	
	int delete(EmpVO empVO);
	
	int getTotalCount();
	
	List<EmpVO> getListWithPaging(Criteria cri);
	
}

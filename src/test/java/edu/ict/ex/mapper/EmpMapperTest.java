package edu.ict.ex.mapper;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class EmpMapperTest {
	@Autowired
	private EmpMapper empMapper;
	
	@Disabled
	@Test
	void testEmpList() {
		//System.out.println(empMapper.getList());
		for (EmpVO vo : empMapper.empList()) {
			System.out.println(vo);
		}
	}
	
	@Disabled
	@Test
	void testEmpDeptList() {
		//System.out.println(empMapper.empDeptList());
		for (EmpVO vo : empMapper.empDeptList()) {
			System.out.println(vo);
		}
	}

	@Disabled
	@Test
	void testDeptEmpList() {
		System.out.println(empMapper.deptEmpList());
	}
	
	//@Disabled
	@Test
	void testEmpDeptSalgradeList() {
		System.out.println(empMapper.deptEmpSalgradeList());
	}
}

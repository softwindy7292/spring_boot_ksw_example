package edu.ict.ex.vo;

import org.junit.jupiter.api.Test;

class EmpVOTest {

	@Test
	void testEmpVO() {
		EmpVO empVO = new EmpVO();
		
		empVO.setEmpno(100);
		empVO.setEname("에헤이");
		empVO.setJob("굿잡");
		empVO.setMgr(200);
		
		System.out.println(empVO.getEmpno());
		System.out.println(empVO.getEname());
		System.out.println(empVO.getJob());
		System.out.println(empVO.getMgr());
	}

}

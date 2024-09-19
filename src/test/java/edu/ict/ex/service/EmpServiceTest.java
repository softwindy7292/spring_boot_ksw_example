package edu.ict.ex.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.vo.EmpVO;

@SpringBootTest
class EmpServiceTest {
	@Autowired
	private EmpService service;

	@Test
	void testEmpList() {
		for (EmpVO vo : service.empList()) {
			System.out.println(vo);
		}
	}

}

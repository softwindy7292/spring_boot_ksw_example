package edu.ict.ex.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.vo.DeptVO;

@SpringBootTest
class DeptServiceTest {
	@Autowired
	private DeptService service;
	
	@Test
	void testGetList() {
		for (DeptVO vo : service.getList()) {
			System.out.println(vo);
		}
	}

}

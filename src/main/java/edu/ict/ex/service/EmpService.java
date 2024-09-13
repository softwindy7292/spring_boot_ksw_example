package edu.ict.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ict.ex.mapper.EmpMapper;
import edu.ict.ex.vo.DeptVO;
import edu.ict.ex.vo.EmpVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmpService {
	@Autowired
	private EmpMapper empMapper;
	
	public List<EmpVO> empList(){
		System.out.println("empList()..");
		
		return empMapper.empList();
	}
	
	public List<DeptVO> deptList(){
		System.out.println("deptList()..");
		
		return empMapper.deptList();
	}

	public void join(EmpVO empVO) {
		log.info("join()..");
		
		empMapper.join(empVO);		
	}
}

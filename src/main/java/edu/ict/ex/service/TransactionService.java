package edu.ict.ex.service;

import java.io.File;
import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.ict.ex.mapper.BoardMapper;
import edu.ict.ex.vo.BoardVO;

@Service
public class TransactionService {

	@Autowired
	private BoardMapper mapper;
	
	@Transactional
	public void txTest1() {
		
		System.out.println("1번 테스트...................");
		BoardVO vo = new BoardVO();
		
		vo.setBcontent("트랜젝션1");
		vo.setBname("트랜젝션1");
		vo.setBtitle("트랜젝션1");
		
		mapper.write(vo);
		
		System.out.println("2번 테스트...................");
		BoardVO vo2 = new BoardVO();
		
		vo2.setBcontent("트랜젝션2");
		vo2.setBname("트랜젝션2");
		vo2.setBtitle("트랜젝션2");
		
		vo2 = null;
		
		mapper.write(vo2);
		
	}
	
	@Transactional
	public void txTest2() {
		
		System.out.println("테스트 2번...");
		
		BoardVO boardVO = new BoardVO();
		
		boardVO.setBcontent("트랜젝션4");
		boardVO.setBname("트랜젝션4");
		boardVO.setBtitle("트랜젝션4");
		
		mapper.write(boardVO);
		
		throw new RuntimeException("RuntimeException for rollback");
		
	}
	
	@Transactional
	public void txTest3() throws SQLException {
		
		System.out.println("테스트 3번...");
		
		BoardVO boardVO = new BoardVO();
		
		boardVO.setBcontent("트랜젝션5");
		boardVO.setBname("트랜젝션5");
		boardVO.setBtitle("트랜젝션5");
		
		mapper.write(boardVO);
		
		throw new SQLException("이 Exception은 롤백이 안 됨");
		
	}
	
	// @Transactional의 rollbackFor 옵션을 이용하면 Rollback이 되는 클래스를 지정가능함.
	// Exception예외로 롤백을 하려면 다음과 같이 지정하면됩니다.
	// @Transactional(rollbackFor = Exception.class)
	// 여러개의 예외를 지정할 수도 있습니다.
	@Transactional(rollbackFor = Exception.class)
	public void txTest4() throws SQLException {
		
		System.out.println("테스트 4번...");
		
		BoardVO boardVO = new BoardVO();
		
		boardVO.setBcontent("트랜젝션6");
		boardVO.setBname("트랜젝션6");
		boardVO.setBtitle("트랜젝션6");
		
		mapper.write(boardVO);
		
		throw new SQLException("이 Exception은 롤백이 안 됨");
		
	}
	
	public void checkExample() {
		
		File file = new File("aa.txt");
		try {
			Scanner scanner = new Scanner(file);
			scanner.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

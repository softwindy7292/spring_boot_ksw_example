package edu.ict.ex.mapper;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class BoardMapperTest {
	@Autowired
	private BoardMapper boardMapper;
	
	@Disabled
	@Test
	void testGetList() {
		for (BoardVO vo : boardMapper.getList()) {
			System.out.println(vo);
		}
	}
	
	@Disabled
	@Test
	void testRead() {
		System.out.println(boardMapper.read(22));
	}
	
	@Disabled
	@Test
	void testDelete() {
		int count = boardMapper.delete(23);
		
		System.out.println("삭제된 개수 : " + count);
		
		if(boardMapper.read(23) == null) {
			System.out.println("제대로 삭제되었음");
		}
	}
	
	@Disabled
	@Test
	void testWrite() {
		int count = boardMapper.write("김선우", "나는 문어", "꿈을 꾸는 문어");
		
		System.out.println("추가된 개수 : " + count);
	}

	@Test
	void testModify() {
		int count = boardMapper.modify(83, "김선우", "나는 문어", "꿈을 꾸는 문어");
		
		System.out.println("업데이트 된 개수 : " + count);
	}
	
}

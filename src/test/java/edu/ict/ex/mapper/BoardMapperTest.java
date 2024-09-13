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
		BoardVO board = new BoardVO();
		board.setBname("이리");
		board.setBtitle("오너라");
		board.setBcontent("이리이리이리이리이리이리이리이");
		
		int count = boardMapper.write(board);
		
		System.out.println("추가된 개수 : " + count);
	}

	@Disabled
	@Test
	void testModify() {
		BoardVO board = new BoardVO();
		board.setBid(85);
		board.setBname("아니오");
		board.setBtitle("아닙니다");
		board.setBcontent("부정");
		
		int count = boardMapper.modify(board);
		
		System.out.println("업데이트 된 개수 : " + count);
	}
	
}

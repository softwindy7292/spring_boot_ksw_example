package edu.ict.ex.service;

import java.util.List;

import edu.ict.ex.page.Criteria;
import edu.ict.ex.vo.BoardVO;

public interface BoardService {
	
	List<BoardVO> getList();

	BoardVO get(BoardVO boardVO);

	int delete(BoardVO boardVO);

	int write(BoardVO boardVO);

	int modify(BoardVO boardVO);
	
	void writeReply(BoardVO boardVO);
	
	void upHit(BoardVO boardVO);
	
	int getTotal();
	
	List<BoardVO> getListWithPaging(Criteria cri);
}

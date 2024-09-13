package edu.ict.ex.service;

import java.util.List;

import edu.ict.ex.vo.BoardVO;

public interface BoardService {
	
	List<BoardVO> getList();

	BoardVO get(int bid);

	int delete(int bid);

	int write(BoardVO boardVO);

	int modify(BoardVO boardVO);
	
	void writeReply(BoardVO boardVO);
}

package edu.ict.ex.service;

import java.util.List;

import edu.ict.ex.vo.BoardVO;

public interface BoardService {
	
	List<BoardVO> getList();

	BoardVO get(int bid);

	void delete(int bid);

	void write(String bname, String btitle, String bcontent);

	void modify(int bid, String bname, String btitle, String bcontent);
}

package edu.ict.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ict.ex.mapper.BoardMapper;
import edu.ict.ex.vo.BoardVO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList() {
		log.info("getList()..");
		
		return boardMapper.getList();
	}

	@Override
	public BoardVO get(int bid) {
		log.info("get()..");
		
		return boardMapper.read(bid);
	}

	@Override
	public int delete(int bid) {
		log.info("delete()..");
		
		return boardMapper.delete(bid);
	}

	@Override
	public int write(BoardVO boardVO) {
		log.info("write()..");
		
		return boardMapper.write(boardVO);
	}

	@Override
	public int modify(BoardVO boardVO) {
		log.info("modify()..");
		
		return boardMapper.modify(boardVO);
		
	}
	
}

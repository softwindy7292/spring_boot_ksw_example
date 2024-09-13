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
	public BoardVO get(BoardVO boardVO) {
		log.info("get()..");
		
		boardMapper.upHit(boardVO);
		
		return boardMapper.read(boardVO);
	}

	@Override
	public int delete(BoardVO boardVO) {
		log.info("delete()..");
		
		return boardMapper.delete(boardVO);
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

	// 순서있는 기능이 오는 부분 = 비지니스 로직
	@Override
	public void writeReply(BoardVO boardVO) {
		log.info("writeReply()..");
		
		boardMapper.updateShape(boardVO);
		boardMapper.insertReply(boardVO);
	}

	@Override
	public void upHit(BoardVO boardVO) {
		log.info("upHit()..");
		
		boardMapper.upHit(boardVO);
	}
	
}

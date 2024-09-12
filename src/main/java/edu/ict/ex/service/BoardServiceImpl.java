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
	public void delete(int bid) {
		log.info("delete()..");
		
		boardMapper.delete(bid);
	}

	@Override
	public void write(String bname, String btitle, String bcontent) {
		log.info("write()..");
		
		boardMapper.write(bname, btitle, bcontent);
	}

	@Override
	public void modify(int bid, String bname, String btitle, String bcontent) {
		log.info("modify()..");
		
		boardMapper.modify(bid, bname, btitle, bcontent);
		
	}
	
}

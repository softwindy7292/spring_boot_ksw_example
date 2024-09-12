package edu.ict.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.ict.ex.vo.BoardVO;

@Mapper
public interface BoardMapper {
	
	List<BoardVO> getList();

	BoardVO read(int bid);

	int delete(int bid); // 삭제 된 개수 리턴

	int write(String bname, String btitle, String bcontent);

	int modify(int bid, String bname, String btitle, String bcontent);
	
}

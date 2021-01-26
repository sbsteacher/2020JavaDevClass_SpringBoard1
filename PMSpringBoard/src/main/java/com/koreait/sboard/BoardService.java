package com.koreait.sboard;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.koreait.sboard.model.BoardEntity;

@Service
public class BoardService {
	
	@Autowired
	private BoardMapper mapper;
	
	public List<BoardEntity> selBoardList() {
		return mapper.selBoardList();
	}
	
	public int insBoard(BoardEntity p) {
		return mapper.insBoard(p);
	}
	
	public BoardEntity selBoard(BoardEntity p) {
		return mapper.selBoard(p);
	}
	
	public int updBoard(BoardEntity p) {
		return mapper.updBoard(p);
	}
	
	public int delBoard(BoardEntity p) {
		return mapper.delBoard(p);
	}
}










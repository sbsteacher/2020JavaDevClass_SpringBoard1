package com.koreait.sboard;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.koreait.sboard.model.BoardEntity;

@Mapper
public interface BoardMapper {
	List<BoardEntity> selBoardList();
	int insBoard(BoardEntity p);
	BoardEntity selBoard(BoardEntity p);
	int updBoard(BoardEntity p);
	int delBoard(BoardEntity p);
}






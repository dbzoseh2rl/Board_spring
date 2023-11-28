package com.ldkspringbase.mapper;

import com.ldkspringbase.entity.BoardEntity;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardEntity> getAllBoards();
    BoardEntity getBoardById(int id);
    void createBoard(BoardEntity board);
    void updateBoard(BoardEntity board);
    void deleteBoard(int id);
}


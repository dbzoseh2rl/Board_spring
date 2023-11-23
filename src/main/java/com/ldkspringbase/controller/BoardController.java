package com.ldkspringbase.controller;
import com.ldkspringbase.BoardRepository;
import com.ldkspringbase.entity.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/boards")
public class BoardController {

    @Autowired
    private BoardRepository boardRepository;

    // 모든 게시물 조회
    @GetMapping
    public List<Board> getAllBoards() {
        return boardRepository.findAll();
    }

    // 특정 ID의 게시물 조회
    @GetMapping("/{id}")
    public Board getBoardById(@PathVariable int id) {
        return boardRepository.findById(id).orElse(null);
    }

    // 게시물 생성
    @PostMapping
    public Board createBoard(@RequestBody Board board) {
        return boardRepository.save(board);
    }

    // 게시물 수정
    @PutMapping("/{id}")
    public Board updateBoard(@PathVariable int id, @RequestBody Board updatedBoard) {
        Board existingBoard = boardRepository.findById(id).orElse(null);
        if (existingBoard != null) {
            existingBoard.setUserName(updatedBoard.getUserName());
            existingBoard.setTitle(updatedBoard.getTitle());
            existingBoard.setContent(updatedBoard.getContent());
            existingBoard.setPostDate(updatedBoard.getPostDate());
            existingBoard.setViews(updatedBoard.getViews());
            return boardRepository.save(existingBoard);
        } else {
            return null; // 예외 처리를 추가할 수도 있습니다.
        }
    }

    // 게시물 삭제
    @DeleteMapping("/{id}")
    public void deleteBoard(@PathVariable int id) {
        boardRepository.deleteById(id);
    }
}



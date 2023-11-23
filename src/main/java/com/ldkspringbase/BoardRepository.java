package com.ldkspringbase;

import com.ldkspringbase.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Integer> {
    // 추가적인 메서드가 필요하면 여기에 추가
}

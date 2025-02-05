package kr.co.techeer.board.repository;

import kr.co.techeer.board.entity.Board;
import kr.co.techeer.board.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LikeRepository extends JpaRepository<Like, Integer> {
    Like findByBoard(Board board);
}

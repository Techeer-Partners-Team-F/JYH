package kr.co.techeer.board.service;

import kr.co.techeer.board.entity.Board;
import kr.co.techeer.board.entity.Like;
import kr.co.techeer.board.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {

    @Autowired
    private LikeRepository likeRepository;

    public void likePost(Board board) {
        Like like = new Like();
        like.setBoard(board);

        likeRepository.save(like);
    }

    public void dislikePost(Board board) {
        Like like = likeRepository.findByBoard(board);
        if (like != null) {
            likeRepository.delete(like);
        }
    }
}



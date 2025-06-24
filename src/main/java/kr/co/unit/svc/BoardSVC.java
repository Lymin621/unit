package kr.co.unit.svc;

import kr.co.unit.mapper.BoardMapper;
import kr.co.unit.vo.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardSVC {
    @Autowired
    BoardMapper mapper;

    public int boardWrite(Board board){
        return mapper.boardWrite(board);
    }

    public List<Board> boardList(){
        return mapper.boardList();
    }
}

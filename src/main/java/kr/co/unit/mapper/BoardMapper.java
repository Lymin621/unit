package kr.co.unit.mapper;


import kr.co.unit.vo.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    //글등록
    int boardWrite(Board board);

    //전체글 목록
    List<Board> boardList();
}

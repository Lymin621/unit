package kr.co.unit.mapper;
import com.boot.board.vo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
        int joinUs(User user);

        User login(User user);


        // 회원 정보 수정
        int userUpdate(User user);
        //나의 정보만 조회
        User userOne(String uid);

        //회원 탈퇴
        int userDelete(String uid);
}

package kr.co.unit.svc;

import com.boot.board.mapper.UserMapper;
import com.boot.board.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSVC {
    @Autowired
    UserMapper userMapper;



    public int joinUs(User user) {
        return userMapper.joinUs(user);
    }

    public User login(User user) {
        return userMapper.login(user);
    }


    //회원 정보 수정
    public int userUpdate(User user){
        return userMapper.userUpdate(user);
    }
    //나의 정보 보기
    public User userOne(String uid){
        return userMapper.userOne(uid);
    }

    //회원 탈퇴
    public int userDelete(String uid){
        return userMapper.userDelete(uid);
    }
}
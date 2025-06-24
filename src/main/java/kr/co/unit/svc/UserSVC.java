package kr.co.unit.svc;
;
import kr.co.unit.mapper.UserMapper;
import kr.co.unit.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSVC {
    @Autowired
    UserMapper mapper;



    public int joinUs(kr.co.unit.vo.User user) {
        return mapper.joinUs(user);
    }

    public User login(User user) {
        return mapper.login(user);
    }


    //회원 정보 수정
    public int userUpdate(User user){
        return mapper.userUpdate(user);
    }
    //나의 정보 보기
    public User userOne(String uid){
        return mapper.userOne(uid);
    }

    //회원 탈퇴
    public int userDelete(String uid){
        return mapper.userDelete(uid);
    }

    public int idChk(String uid) {
        return mapper.idChk(uid);
    }
}
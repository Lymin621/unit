package kr.co.unit;

import kr.co.unit.svc.BoardSVC;
import kr.co.unit.svc.UserSVC;
import kr.co.unit.vo.Board;
import kr.co.unit.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@RestController
public class AjaxRestController {
    @Value("${file.upload-path}")
    private String filepath;

    @Autowired
    UserSVC svc;

    @Autowired
    BoardSVC bsvc;


    @GetMapping("/docs/{filename}")
    public ResponseEntity<Resource> fileAjax(@PathVariable(value = "filename") String fnm) throws Exception {
        Path path = Paths.get(filepath);
        Resource resource = null;

        if (path == null || !Files.exists(path)) {
            System.out.println("경로가 잘못되었습니다.");
            return ResponseEntity.notFound().build(); // 404 응답
        } else {
            path = path.resolve(fnm);
            resource = new UrlResource(path.toUri());

            if (!resource.exists() || !resource.isReadable()) {
                System.out.println("파일이 존재하지 않거나 읽을 수 없습니다.");
                return ResponseEntity.notFound().build(); // 404 응답
            }
        }

        String contentType = Files.probeContentType(path);
        if (contentType == null) {
            contentType = "application/octet-stream"; // 기본 MIME 타입
        }

        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))  //문자열로 주어진 MIME 타입을 MediaType 객체로 변환
                .body(resource);
    }

    @PostMapping("/idCheck")
    public String idChk(@RequestBody User user){
        System.out.println(user);
        int cnt = svc.idChk(user.getUid());
        if(cnt>0) return "사용중인 아이디 입니다.";
        else return "사용가능한 아이디 입니다.";
    }

    @GetMapping("/boardList")
    public List<Board> boardList(){
        return bsvc.boardList();
    }

}

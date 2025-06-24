package kr.co.unit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AjaxController {

    @GetMapping("/")
    public String home(){
        return "ajax01";
    }

    @GetMapping("/ajax3")
    public String ajax3(){
        return "ajax03";
    }

    @PostMapping("/test.do")
    public String testdo(Model model, @RequestParam String val1, @RequestParam String val2){
        model.addAttribute("val1",val1);
        model.addAttribute("val2",val2);
        return "testdo";
    }

    @GetMapping("/test.do")
    public String testdo(@RequestParam String id, @RequestParam String password, Model model){
        model.addAttribute("id",id);
        model.addAttribute("password",password);
        return "testdo";
    }

    @GetMapping("/ajax2")
    public String ajax02(){
        return "ajax02";
    }
}

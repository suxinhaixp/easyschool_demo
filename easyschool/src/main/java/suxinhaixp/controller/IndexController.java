package suxinhaixp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexController {
    @RequestMapping("/index")
    public String student() {
        return "index";
    }
    @RequestMapping("/leftstudent")
    public String leftstudent() {
        return "leftstudent";
    }
    @RequestMapping("/main")
    public String main() {
        return "main";
    }
    @RequestMapping("/leftteacher")
    public String leftteacher() {
        return "leftteacher";
    }

    @RequestMapping("/Studentscorelist")
    public String Studentscorelist() {
        return "Studentscorelist";
    }





}

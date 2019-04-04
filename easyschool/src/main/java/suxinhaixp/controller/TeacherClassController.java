package suxinhaixp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import suxinhaixp.dao.TeacherClassDao;
import suxinhaixp.dao.lessonDao;
import suxinhaixp.entity.TeacherClass;
import suxinhaixp.entity.User;
import suxinhaixp.entity.lesson;
import suxinhaixp.message.Response;

import java.util.List;

@Controller
@RequestMapping("")
public class TeacherClassController {
    @Autowired
    private TeacherClassDao teacherClassDao;

    @RequestMapping("/tlesson")
    public String tlesson() {
        return "tlesson";
    }


    @ResponseBody
    @RequestMapping(value = "/tlessonlist", method = RequestMethod.POST)
    public Response form(@RequestBody User user) {
        System.out.println(user.getId());
        List<TeacherClass> classno=teacherClassDao.findAllByIdno(user.getId());

        if (classno!=null) {
            Response response=new Response("none",classno);
            return response;
        }
        return null;
    }
}

package suxinhaixp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import suxinhaixp.dao.TeacherDao;
import suxinhaixp.dao.UserDao;
import suxinhaixp.entity.Teacher;
import suxinhaixp.entity.User;
import suxinhaixp.message.Response;

@Controller
@Repository("")
public class TeacherController {

    @Autowired
    private TeacherDao teacherDao;
    @RequestMapping(value="tdetail")
    public String tdetail() {
        return "tdetail";
    }


    @ResponseBody
    @RequestMapping(value = "/tform", method = RequestMethod.POST)
    public Response tform(@RequestBody Teacher userid) {
        Teacher user=teacherDao.findById(userid.getId());
        user.setUserEntity(null);
        if (userid!=null) {
            Response response=new Response("none",user);
            return response;
        }
        return null;
    }


}

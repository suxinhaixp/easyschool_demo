package suxinhaixp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import suxinhaixp.dao.TeacherDao;
import suxinhaixp.dao.UserDao;
import suxinhaixp.dao.UserEntityDao;
import suxinhaixp.entity.LoginParamater;
import suxinhaixp.entity.Teacher;
import suxinhaixp.entity.User;
import suxinhaixp.entity.UserEntity;
import suxinhaixp.message.Response;

/**
 * Created by Administrator on 2017/5/12.
 */

//@RestController
    @Controller
@RequestMapping("")
public class UserEntityController {

    @Autowired
    private UserEntityDao userEntityDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private TeacherDao teacherDao;


    //学生
    @RequestMapping(value="student")
    public String student() {
        return "student";
    }

    //老师页面
    @RequestMapping(value="teacher")
    public String teacher() {
        return "teacher";
    }

    //登录页面
    @RequestMapping(value="/")
    public String login() {
        return "login";
    }
    @RequestMapping(value="login")
    public String logintoo() {
        return "login";
    }

    //登录方法
@ResponseBody
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Response update(@RequestBody UserEntity user) {
        System.out.println(user.getId()+user.getPassword());
//        HttpServletRequest 为javax.servlet.http包下
        UserEntity userEntity = userEntityDao.findByIdAndPassword(user.getId(), user.getPassword());
//    System.out.println(userEntity.getUsername());
        if (userEntity != null) {
            if (userEntity.isRoot()==true) {
                Response response = new Response("Exist", user);
                return response;
            }
            else {
                Response response = new Response("none", user);
                return response;
            }
        }
        else
        {
            //todo 加自己的处理逻辑
            System.out.println(user.getId()+user.getPassword());
            Response response = new Response("Done", user);
            return response;
        }
    }



    @ResponseBody
    @RequestMapping(value = "/findId", method = RequestMethod.POST)
    public Response findId(@RequestBody UserEntity user) {

//        HttpServletRequest 为javax.servlet.http包下
        User userEntity = userDao.findById(user.getId());
          if (userEntity!=null) userEntity.setUserEntity(null);
        Teacher teacher=teacherDao.findById(user.getId());
        if (teacher!=null)  teacher.setUserEntity(null);
//    System.out.println(userEntity.getUsername());
        if (userEntity != null) {
                Response response = new Response("Exists", userEntity);
                return response;

        }
        else if(teacher!=null)
        {
            //todo 加自己的处理逻辑
            Response response = new Response("Existt", teacher);
            return response;
        }
        else {
            Response response = new Response("Done", teacher);
            return response;
        }
    }

    @ResponseBody
    @GetMapping(value = "/sure")
    public Response istrue(@RequestBody UserEntity user)
    {
      //  HttpServletRequest 为javax.servlet.http包下
        User userEntity = userDao.findById(user.getId());
        if (userEntity!=null) userEntity.setUserEntity(null);
        Teacher teacher=teacherDao.findById(user.getId());
        if (teacher!=null)  teacher.setUserEntity(null);
//      System.out.println(userEntity.getUsername());
        if (userEntity != null) {
            Response response = new Response("Exists", userEntity);
            return response;

        }
        else if(teacher!=null)
        {
            //todo 加自己的处理逻辑
            Response response = new Response("Existt", teacher);
            return response;
        }
        else {
            Response response = new Response("Done", teacher);
            return response;
        }
    }



}

package suxinhaixp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import suxinhaixp.dao.UserDao;
import suxinhaixp.dao.UserEntityDao;
import suxinhaixp.entity.LoginParamater;
import suxinhaixp.entity.User;
import suxinhaixp.entity.UserEntity;
import suxinhaixp.message.Response;

@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    private  UserDao userdao;

//学籍信息
    @RequestMapping(value="detail")
    public String detail() {
        return "detail";
    }


    @ResponseBody
     @RequestMapping(value = "/form", method = RequestMethod.POST)
     public Response form(@RequestBody User userid) {
         User user=userdao.findById(userid.getId());
        user.setUserEntity(null);
            if (userid!=null) {
              Response response=new Response("none",user);
              return response;
            }
            return null;
     }
}

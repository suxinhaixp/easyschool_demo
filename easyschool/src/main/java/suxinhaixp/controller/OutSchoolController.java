package suxinhaixp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import suxinhaixp.dao.OutSchoolDao;
import suxinhaixp.dao.ScoreDao;
import suxinhaixp.entity.OutSchool;
import suxinhaixp.entity.Score;
import suxinhaixp.entity.User;
import suxinhaixp.message.Response;

import java.util.List;

@Controller
@RequestMapping("")
public class OutSchoolController {

    @Autowired
    private OutSchoolDao outSchoolDao;

    @RequestMapping("/OutSchool")
    public String OutSchool() {
        return "OutSchool";
    }


    @ResponseBody
    @RequestMapping("/OutSchoollist")
    public Response ScoreList(@RequestBody User user) {
        List<OutSchool> scores=outSchoolDao.findAllByIdno(user.getId());
        Response response=new Response("none",scores);
        return response;
    }
}

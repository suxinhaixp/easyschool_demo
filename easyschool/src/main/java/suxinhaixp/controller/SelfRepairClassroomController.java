package suxinhaixp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import suxinhaixp.dao.SelfRepairClassroomDao;
import suxinhaixp.entity.SelfRepairClassroom;
import suxinhaixp.message.Response;

import java.util.List;

@Controller
@RequestMapping("")
public class SelfRepairClassroomController {
    @Autowired
    private SelfRepairClassroomDao selfRepairClassroomDao;



    @RequestMapping("SelfRepairClassroom")
    public String SelfRepairClassroom() {
        return "SelfRepairClassroom";
    }


    @ResponseBody
    @RequestMapping("/classroom")
    public Response classroom() {
        List<SelfRepairClassroom> classroom=selfRepairClassroomDao.findAll();


        Response response=new Response("none",classroom);
        return response;



    }




}

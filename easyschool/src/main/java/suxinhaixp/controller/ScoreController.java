package suxinhaixp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import suxinhaixp.dao.ScoreDao;
import suxinhaixp.dao.SelfRepairClassroomDao;
import suxinhaixp.entity.Score;
import suxinhaixp.entity.SelfRepairClassroom;
import suxinhaixp.entity.User;
import suxinhaixp.message.Response;

import java.util.List;

@Controller
@RequestMapping("")
public class ScoreController {

    @Autowired
    private ScoreDao scoreDao;

    @RequestMapping("/ScoreReport")
    public String ScoreReport() {
        return "ScoreReport";
    }

    @ResponseBody
    @RequestMapping("/tScoreList")
    public Response tScoreList(@RequestBody User user) {
        List<Score> scores=scoreDao.findAllByIdnoAndTerm(user.getId(),Long.parseLong(user.getYear_all()));
        if(scores.size()!=0) {
            Response response = new Response("Exist", scores);
            return response;
        }
        else {
            Response response = new Response("none", scores);
            return response;

        }
    }
    @ResponseBody
    @RequestMapping("/ScoreList")
    public Response ScoreList(@RequestBody User user) {
        List<Score> scores=scoreDao.findAllByIdno(user.getId());
        if(scores.size()!=0) {
            Response response = new Response("Exist", scores);
            return response;
        }
        else {
            Response response = new Response("none", scores);
            return response;

        }
    }





}

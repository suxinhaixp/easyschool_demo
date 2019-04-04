package suxinhaixp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import suxinhaixp.dao.ScoreDao;
import suxinhaixp.dao.UserDao;
import suxinhaixp.dao.lessonDao;
import suxinhaixp.entity.Score;
import suxinhaixp.entity.User;
import suxinhaixp.entity.lesson;
import suxinhaixp.message.Response;
import suxinhaixp.message.ScoreService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

@Controller
@RequestMapping("")
public class AddScoreController {
    @Autowired
    private ScoreDao scoreDao;
    @Autowired
    private UserDao userDao;

    @RequestMapping("/addscore")
    public String addscore() {
        return "addscore";
    }

    @ResponseBody
    @RequestMapping(value = "/addScore", method = RequestMethod.POST)
    public Response form(@RequestBody Score score) {
        if (scoreDao.findByIdnoAndClasscode(score.getIdno(), score.getClasscode()) != null) {
            Response response = new Response("Already", "Already");
            return response;
        } else {
            if (userDao.findById(score.getIdno()) != null) {
                Score newscore = new Score(score.getIdno(), score.getClasscode(), score.getClassname(), score.getDecq(), score.getDaily_score(), "", score.getLast_score(), score.getAll_score(), score.getTerm());
                System.out.println(newscore);
                scoreDao.save(newscore);
                if (newscore != null) {
                    Response response = new Response("Exist", newscore);
                    return response;
                } else {
                    Response response = new Response("none", newscore);
                    return response;
                }
            } else {
                Response response = new Response("none", score);
                return response;
            }
        }
    }


    @ResponseBody
    @RequestMapping(value = "/modifyform", method = RequestMethod.POST)
    public Response modifyform(@RequestBody Score score) {

        if (scoreDao.findByIdnoAndClasscode(score.getIdno(), score.getClasscode()) != null) {

            if (score.getId() == 1) {
                if (scoreDao.update1(score.getMiddle_score(), score.getIdno(), score.getClasscode()) == 1) {
                    Response response = new Response("success", score);
                    return response;
                } else {
                    Response response = new Response("failed", score);
                    return response;
                }
            }
            if (score.getId() == 2) {
                if (scoreDao.update2(score.getMiddle_score(), score.getIdno(), score.getClasscode()) == 1) {
                    Response response = new Response("success", score);
                    return response;
                } else {
                    Response response = new Response("failed", score);
                    return response;
                }
            }
            if (score.getId() == 3) {
                if (scoreDao.update3(score.getMiddle_score(), score.getIdno(), score.getClasscode()) == 1) {
                    Response response = new Response("success", score);
                    return response;
                } else {
                    Response response = new Response("failed", score);
                    return response;
                }
            }
            Response response = new Response("error", "null");
            return response;
        } else {
            Response response = new Response("error", "null");
            return response;
        }
    }
}





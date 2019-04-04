package suxinhaixp.message;


import org.springframework.stereotype.Service;
import suxinhaixp.dao.ScoreDao;
import suxinhaixp.entity.Score;

import javax.annotation.Resource;

@Service
public class ScoreService {
    @Resource
    private ScoreDao scoreDao;

    public void saveScore(Score u) {
        scoreDao.save(u);
    }
}

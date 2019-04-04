package suxinhaixp.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import suxinhaixp.entity.Score;
import java.util.List;

@Repository
public interface ScoreDao  extends CrudRepository<Score,Long> {

    public List<Score> findAllByIdno(Long idno);
    public List<Score> findAllByIdnoAndTerm(Long idno, Long term);
    public Score findByIdnoAndClasscode(Long idno, String classcode);

    @Modifying
    @Transactional
    @Query("update score s  set s.daily_score = ?1 where s.idno = ?2 and s.classcode = ?3")
    int update1(String score, Long idno, String classcode);

    @Modifying
    @Transactional
    @Query("update score  set last_score = ?1 where idno = ?2 and classcode = ?3")
    int update2(String score, Long idno, String classcode);

    @Modifying
    @Transactional
    @Query("update score  set all_score = ?1 where idno = ?2 and classcode = ?3")
    int update3(String score, Long idno, String classcode);

}

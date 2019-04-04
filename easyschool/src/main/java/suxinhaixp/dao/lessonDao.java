package suxinhaixp.dao;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import suxinhaixp.entity.lesson;

import java.util.List;


@Repository
public interface lessonDao extends CrudRepository<lesson,Long> {

    public List<lesson> findAllByIdno(Long idno);
}

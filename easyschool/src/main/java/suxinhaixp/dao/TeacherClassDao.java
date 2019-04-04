package suxinhaixp.dao;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import suxinhaixp.entity.Teacher;
import suxinhaixp.entity.TeacherClass;
import suxinhaixp.entity.lesson;

import java.util.List;


@Repository
public interface TeacherClassDao extends CrudRepository<TeacherClass,Long> {

    public List<TeacherClass> findAllByIdno(Long idno);
}
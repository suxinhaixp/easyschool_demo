package suxinhaixp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import suxinhaixp.entity.Teacher;
import suxinhaixp.entity.User;

@Repository
public interface TeacherDao extends CrudRepository<Teacher,Long> {

    public Teacher findById(Long Id);


}
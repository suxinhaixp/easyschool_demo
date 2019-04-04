package suxinhaixp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import suxinhaixp.entity.OutSchool;

import java.util.List;

@Repository
public interface OutSchoolDao extends CrudRepository<OutSchool,Long> {

   public List<OutSchool>  findAllByIdno(Long idno);
}

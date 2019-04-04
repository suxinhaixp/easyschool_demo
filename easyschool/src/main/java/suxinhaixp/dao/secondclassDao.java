package suxinhaixp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import suxinhaixp.entity.secondclass;
@Repository
public interface secondclassDao extends CrudRepository<secondclass,Long> {

    public secondclass findByIdno(Long idno);
}

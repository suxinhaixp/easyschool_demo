package suxinhaixp.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import suxinhaixp.entity.SelfRepairClassroom;
import suxinhaixp.entity.User;

import java.util.List;

@Repository
    public interface SelfRepairClassroomDao extends CrudRepository<SelfRepairClassroom,Long> {

    public List<SelfRepairClassroom> findAll();

    }

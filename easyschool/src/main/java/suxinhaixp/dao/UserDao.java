package suxinhaixp.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import suxinhaixp.entity.User;

/**
 * Created by Administrator on 2017/5/12.
 */

@Repository
public interface UserDao extends CrudRepository<User,Long>{

    public User findById(Long Id);
}
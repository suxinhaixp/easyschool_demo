package suxinhaixp.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import suxinhaixp.entity.UserEntity;

/**
 * Created by Administrator on 2017/5/12.
 */

@Repository
public interface UserEntityDao extends CrudRepository<UserEntity,Long>{

    public UserEntity findByIdAndPassword(Long Id, String Password);
    public UserEntity findById(Long Id);


}

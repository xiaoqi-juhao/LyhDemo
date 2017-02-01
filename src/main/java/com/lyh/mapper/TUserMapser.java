package com.lyh.mapper;

import com.lyh.entity.TUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Seven on 2017/1/30.
 */

public interface TUserMapser extends JpaRepository<TUser,Integer>{
    @Query(value="select * from tuser where name like %:name%" ,nativeQuery=true)
    public List<TUser> findByNameLike(@Param("name") String name);
}

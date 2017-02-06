package com.lyh.mapper;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lyh.entity.SysCity;

/**
 * Created by Seven on 2017/1/30.
 */

public interface SysCityMapper extends JpaRepository<SysCity,Integer>{
    @Query(value="select * from sys_city where name like %:name%" ,nativeQuery=true)
    public List<SysCity> findByNameLike(@Param("name") String name);
    
    @Query(value="select * from sys_city where Pid = :Pid" ,nativeQuery=true)
    public List<SysCity> findByPid(@Param("Pid") String Pid);
    
    @Query(value="select * from sys_city where Level = 1 order by id " ,nativeQuery=true)
    public List<SysCity> findByLevelOne();
}

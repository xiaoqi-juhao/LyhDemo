package com.lyh.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lyh.entity.SysCity;
import com.lyh.mapper.SysCityMapper;

/**
 * Created by Seven on 2017/1/30.
 */
@RestController
@RequestMapping(value="/city")
public class SysCityController {
    @Autowired
    private SysCityMapper sysCityMapper;

    //获取所有的1级数据
    @GetMapping(value = "/getCitys")
    public List<SysCity> getSysCityAll(){
        return sysCityMapper.findByLevelOne();
    }
    //获取上级ID的内容
    @GetMapping(value = "/geCity/{pid}")
    public List<SysCity> geSysCityPidList(@PathVariable("pid") String id){
        return sysCityMapper.findByPid(id);
    }
    //获取所有数据
    @GetMapping(value = "/getAll")
    public Page<SysCity> getSysCityPageAll(int page,int size){
    	return sysCityMapper.findAll(new PageRequest(page, size,Direction.DESC,"id"));
    }
    
    @GetMapping(value = "/save")
    public SysCity SaveUser(SysCity user){
        return sysCityMapper.save(user);
    }

    //查询指定ID内容
    @GetMapping(value = "/geSysCity/{id}")
    public SysCity geSysCityOne(@PathVariable("id") Integer id){
        return sysCityMapper.findOne(id);
    }
    //模糊查询name
    @GetMapping(value = "/geSysCityName/{name}")
    public List<SysCity> getLikeUser(@PathVariable("name") String name){
        return sysCityMapper.findByNameLike(name);
    }
}

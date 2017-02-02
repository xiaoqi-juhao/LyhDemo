package com.lyh.controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lyh.entity.SysCity;
import com.lyh.mapper.SysCityMapser;

/**
 * Created by Seven on 2017/1/30.
 */
@RestController
public class SysCityController {
    @Autowired
    private SysCityMapser sysCityMapser;

    @GetMapping(value = "/getAlls")
    public List<SysCity> getSysCityAll(){
        return sysCityMapser.findAll();
    }
    @GetMapping(value = "/getAll")
    public Page<SysCity> getSysCityPageAll(int page,int size){
    	if(page < 1){
    		page = 1;
    	}
    	return sysCityMapser.findAll(new PageRequest(page, size,Direction.DESC,"id"));
    }
    @GetMapping(value = "/save")
    public SysCity SaveUser(SysCity user){
        return sysCityMapser.save(user);
    }

    @GetMapping(value = "/geSysCity/{id}")
    public SysCity geSysCityOne(@PathVariable("id") Integer id){
        return sysCityMapser.findOne(id);
    }
    @GetMapping(value = "/geSysCityName/{name}")
    public List<SysCity> getLikeUser(@PathVariable("name") String name){
        return sysCityMapser.findByNameLike(name);
    }
}

package com.lyh.controllor;

import com.lyh.entity.TUser;
import com.lyh.mapper.TUserMapser;
import com.sun.org.apache.bcel.internal.generic.VariableLengthInstruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Seven on 2017/1/30.
 */
@RestController
public class TUserController {
    @Autowired
    private TUserMapser userMapser;

    @GetMapping(value = "/getAll")
    public List<TUser> getUserAll(){
        return userMapser.findAll();
    }

    @GetMapping(value = "/save")
    public TUser SaveUser(TUser user){
        return userMapser.save(user);
    }

    @GetMapping(value = "/getUser/{id}")
    public TUser getUserOne(@PathVariable("id") Integer id){
        return userMapser.findOne(id);
    }
    @GetMapping(value = "/getUserName/{name}")
    public List<TUser> getLikeUser(@PathVariable("name") String name){
        return userMapser.findByNameLike(name);
    }
}

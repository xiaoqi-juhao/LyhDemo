package com.lyh.controllor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lyh.entity.SysUser;
import com.lyh.mapper.SysUserMapper;

@RestController
@RequestMapping(value="/user")
public class SysUserController {

	@Autowired
	private SysUserMapper sysUserMapper;
	
	@PostMapping(value="/getAll")
	public Page<SysUser> getAll(int Page,int size){
		return sysUserMapper.findAll(new PageRequest(Page,size));
	}
}

package com.lyh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//  用户角色表(关联表)
@Entity
@Table(name="sys_roleuser")
public class SysRoleUser {
	@Id
	@GeneratedValue
    private Integer id;			// ID

    private Integer roleid;		// 角色ID

    private Integer userid;		// 用户ID

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}
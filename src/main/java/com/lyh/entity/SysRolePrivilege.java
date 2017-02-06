package com.lyh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//  角色功能表(关联表)
@Entity
@Table(name="sys_roleprivilege")
public class SysRolePrivilege {
	@Id
	@GeneratedValue
    private Integer id;				// ID

    private Integer roleid;			// 角色ID

    private Integer privilegeid;	// 功能ID

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

    public Integer getPrivilegeid() {
        return privilegeid;
    }

    public void setPrivilegeid(Integer privilegeid) {
        this.privilegeid = privilegeid;
    }
}
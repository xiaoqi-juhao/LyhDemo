package com.lyh.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//  角色表
@Entity
@Table(name="sys_role")
public class SysRole {
	@Id
	@GeneratedValue
    private Integer roleid;				// ID

    private String rolename;			// 名称

    private String rolevalue;			// 值

    private String roleremark;			// 描述

    private Date createtime;			// 创建时间

    private Date updatetime;			// 更新时间

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolevalue() {
        return rolevalue;
    }

    public void setRolevalue(String rolevalue) {
        this.rolevalue = rolevalue == null ? null : rolevalue.trim();
    }

    public String getRoleremark() {
        return roleremark;
    }

    public void setRoleremark(String roleremark) {
        this.roleremark = roleremark == null ? null : roleremark.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

	@Override
	public String toString() {
		return "SysRole [roleid=" + roleid + ", rolename=" + rolename + ", rolevalue=" + rolevalue + ", roleremark="
				+ roleremark + ", createtime=" + createtime + ", updatetime=" + updatetime + "]";
	}
    
    
}
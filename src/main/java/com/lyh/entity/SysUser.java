package com.lyh.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="sys_user")
public class SysUser {
	@Id
	@GeneratedValue
    private Integer userid;			// ID

    private String username;		// 用户名

    private String password;		// 密码
    
    private Byte level;				// 级别

    private Date createtime;		// 创建时间

    private Date updatetime;		// 更新时间

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Byte getLevel() {
		return level;
	}

	public void setLevel(Byte level) {
		this.level = level;
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
		return "SysUser [userid=" + userid + ", username=" + username + ", password=" + password + ", level=" + level
				+ ", createtime=" + createtime + ", updatetime=" + updatetime + "]";
	}

}
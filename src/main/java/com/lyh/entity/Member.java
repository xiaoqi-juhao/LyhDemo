package com.lyh.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//会员表
@Entity
@Table(name="t_member")
public class Member {
	@Id
	@GeneratedValue
    private Integer id;

    private String username;		// 用户名称

    private String nickname;		// 用户昵称

    private String password;		// 密码

    private Integer age;			// 年龄

    private String sex;				// 性别

    private String mobilephone;		// 手机
   
    private String qq;				// QQ
    
    private String weChat;			// 微信

    private String profile;			// 用户简介

    private String headpath;		// 用户头像

    private Date logintime;			// 登录时间

    private Date lastlogintime;		// 最后登录时间

    private Date createtime;		// 创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile == null ? null : profile.trim();
    }

    public String getHeadpath() {
        return headpath;
    }

    public void setHeadpath(String headpath) {
        this.headpath = headpath == null ? null : headpath.trim();
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

	public String getWeChat() {
		return weChat;
	}

	public void setWeChat(String weChat) {
		this.weChat = weChat;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", username=" + username + ", nickname=" + nickname + ", password=" + password
				+ ", age=" + age + ", sex=" + sex + ", mobilephone=" + mobilephone + ", qq=" + qq + ", weChat=" + weChat
				+ ", profile=" + profile + ", headpath=" + headpath + ", logintime=" + logintime + ", lastlogintime="
				+ lastlogintime + ", createtime=" + createtime + "]";
	}

    
}
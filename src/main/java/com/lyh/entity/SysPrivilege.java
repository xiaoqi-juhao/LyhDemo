package com.lyh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
//  功能表
@Entity
@Table(name="sys_privilege")
public class SysPrivilege {
	@Id
	@GeneratedValue
    private Integer privilegeid;			// ID

    private String privilegename;			// 功能名称

    private Integer privilegecode;			// 功能编码

    private Integer parentid;				// 父ID

    private String remark;					// 备注

    private String type;					// 功能类型

    private String usestate;				// 使用状态

    public Integer getPrivilegeid() {
        return privilegeid;
    }

    public void setPrivilegeid(Integer privilegeid) {
        this.privilegeid = privilegeid;
    }

    public String getPrivilegename() {
        return privilegename;
    }

    public void setPrivilegename(String privilegename) {
        this.privilegename = privilegename == null ? null : privilegename.trim();
    }

    public Integer getPrivilegecode() {
        return privilegecode;
    }

    public void setPrivilegecode(Integer privilegecode) {
        this.privilegecode = privilegecode;
    }


    public Integer getParentid() {
		return parentid;
	}

	public void setParentid(Integer parentid) {
		this.parentid = parentid;
	}

	public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getUsestate() {
        return usestate;
    }

    public void setUsestate(String usestate) {
        this.usestate = usestate == null ? null : usestate.trim();
    }

	@Override
	public String toString() {
		return "SysPrivilege [privilegeid=" + privilegeid + ", privilegename=" + privilegename + ", privilegecode="
				+ privilegecode + ", parentid=" + parentid + ", remark=" + remark + ", type=" + type + ", usestate="
				+ usestate + "]";
	}
    
}
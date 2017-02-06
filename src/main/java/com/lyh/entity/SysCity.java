package com.lyh.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
// 城市表
@Entity
@Table(name="sys_city")
public class SysCity {
	@Id
	@GeneratedValue
    private Integer id;				// ID

    private Integer pid;			// 父ID

    private String shortname;		// 简称

    private String name;			// 名称

    private String mergerName;		// 全称

    private Byte level;				// 级别

    private String pinyin;			// 拼音

    private String code;			// 长途区号

    private String zipCode;			// 邮编

    private String first;			// 首字母

    private String lng;				// 经度

    private String lat;				// 维度

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname == null ? null : shortname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMergerName() {
        return mergerName;
    }

    public void setMergerName(String mergerName) {
        this.mergerName = mergerName == null ? null : mergerName.trim();
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first == null ? null : first.trim();
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng == null ? null : lng.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

	@Override
	public String toString() {
		return "SysCity [id=" + id + ", pid=" + pid + ", shortname=" + shortname + ", name=" + name + ", mergerName="
				+ mergerName + ", level=" + level + ", pinyin=" + pinyin + ", code=" + code + ", zipCode=" + zipCode
				+ ", first=" + first + ", lng=" + lng + ", lat=" + lat + "]";
	}
    
    
}
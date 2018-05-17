package com.lfs.www.entity;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

public class TblUser {
    private Integer id;
    
    @NotNull(message="{User.name.notNull}")
    private String name;
    
    @NotNull(message="{User.name.notNull}")
    private Integer age;
    
    @NotNull(message="{User.name.notNull}")
    private String loginname;
    
    @NotNull(message="{User.name.notNull}")
    private String loginpwd;
    
    @NotNull(message="{User.name.notNull}")
    private String address;
    
    @NotNull(message="{User.name.notNull}")
    @Email(message="{User.name.notNull}")
    private String email;

    private Integer positionid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getLoginpwd() {
        return loginpwd;
    }

    public void setLoginpwd(String loginpwd) {
        this.loginpwd = loginpwd == null ? null : loginpwd.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getPositionid() {
        return positionid;
    }

    @Override
	public String toString() {
		return "TblUser [id=" + id + ", name=" + name + ", age=" + age + ", loginname=" + loginname + ", loginpwd="
				+ loginpwd + ", address=" + address + ", email=" + email + ", positionid=" + positionid + "]";
	}

	public void setPositionid(Integer positionid) {
        this.positionid = positionid;
    }
}
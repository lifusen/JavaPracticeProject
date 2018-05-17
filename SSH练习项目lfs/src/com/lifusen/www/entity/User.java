package com.lifusen.www.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_user")
public class User {
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", loginName=" + loginName + ", loginPwd="
				+ loginPwd + ", address=" + address + ", email=" + email + ", positonid=" + positionid + ", tel_list="
				+ tel_list + "]";
	}
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private Integer age;
	private String loginName;
	private String loginPwd;
	private String address;
	private String email;
	private Integer positionid;
	
	@OneToMany(mappedBy="user",fetch=FetchType.EAGER)
	private List<Telphone> tel_list = new ArrayList<>();
	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public Integer getPositionid() {
		return positionid;
	}
	public void setPositionid(Integer positionid) {
		this.positionid = positionid;
	}
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
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Telphone> getTel_list() {
		return tel_list;
	}
	public void setTel_list(List<Telphone> tel_list) {
		this.tel_list = tel_list;
	}

}

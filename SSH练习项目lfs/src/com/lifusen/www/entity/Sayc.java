package com.lifusen.www.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_sayc")
public class Sayc {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private Integer heroid;

	public Integer getHeroid() {
		return heroid;
	}

	public void setHeroid(Integer heroid) {
		this.heroid = heroid;
	}

	@Override
	public String toString() {
		return "Sayc [id=" + id + ", name=" + name + ", instruction=" + instruction + "]";
	}

	private String instruction;

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

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	

}

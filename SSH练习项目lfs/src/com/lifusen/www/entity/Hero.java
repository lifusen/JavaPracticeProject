package com.lifusen.www.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_hero")
public class Hero {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String src_photo;
	private String src_video;
	private String instruction;
	private String category;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Hero [id=" + id + ", name=" + name + ", src_photo=" + src_photo + ", src_video=" + src_video
				+ ", instruction=" + instruction + "]";
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

	public String getSrc_photo() {
		return src_photo;
	}
	public void setSrc_photo(String src_photo) {
		this.src_photo = src_photo;
	}
	public String getSrc_video() {
		return src_video;
	}
	public void setSrc_video(String src_video) {
		this.src_video = src_video;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	
}

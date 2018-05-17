package com.lifusen.www.web.action;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lifusen.www.entity.Hero;
import com.lifusen.www.service.HeroService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("heroAction")
@Scope("prototype")
public class HeroAction extends ActionSupport{
	
	private Hero hero;
	private String scc;




	public String getScc() {
		return scc;
	}
	public void setScc(String scc) {
		this.scc = scc;
	}

	private File file1;
	@Resource(name="heroService")
	private HeroService us;
	
	//下面的是下载所需
	private String name;
	private String fileName;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	private String src;
	private InputStream is;
	private String contentType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public InputStream getIs() {
		return is;
	}
	public void setIs(InputStream is) {
		this.is = is;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public Hero getHero() {
		return hero;
	}
	public void setHero(Hero hero) {
		this.hero = hero;
	}


	public HeroService getUs() {
		return us;
	}
	public void setUs(HeroService us) {
		this.us = us;
	}
	public void validateRegistForm(){
		super.clearFieldErrors();
	}
	public String registForm(){
		return SUCCESS;
	}

	public String regist() {
			String fileName=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+".jpg";
			String path = ServletActionContext.getServletContext().getRealPath("/upload/")+fileName;
			try {
				if(file1!=null){
					System.out.println(file1.getName());
				FileUtils.copyFile(file1, new File(path));
				}
			} catch (IOException e) {
				return INPUT;
			}
			System.out.println(path);
			hero.setSrc_photo("/upload/"+fileName);
			us.regist(hero);
			return SUCCESS;
		}
	
	
	public File getFile1() {
		return file1;
	}
	public void setFile1(File file1) {
		this.file1 = file1;
	}
	public String login(){
		    ActionContext.getContext().put("list", us.login());
			return SUCCESS;
		
	}
	public String select(){
		System.out.println(scc);
		ActionContext.getContext().put("list", us.select(Integer.parseInt(this.scc)));
		return SUCCESS;
	}
	
	public String update(){
		//模拟修改
		us.update(hero);
		System.out.println(scc);
		ActionContext.getContext().put("list", us.select(hero.getId()));
		return SUCCESS;
	}
	public String download() throws UnsupportedEncodingException{
		this.is = ServletActionContext.getServletContext().getResourceAsStream(this.src);
		this.fileName = URLEncoder.encode(name+".jpg", "utf-8");
		//this.fileName = URLEncoder.encode(fileName, "utf-8");
		//this.fileName = URLDecoder.decode(this.fileName, "UTF-8");
		//System.out.println("fileName decode: " + URLDecoder.decode(this.fileName, "UTF-8"));
		this.contentType = "image/jpeg";
		return SUCCESS;
	}
	
	public String download1() throws UnsupportedEncodingException{
		this.is = ServletActionContext.getServletContext().getResourceAsStream(this.src);
		this.fileName = URLEncoder.encode(name, "utf-8");
		this.contentType ="video/mpeg4";
		return SUCCESS;
	}
}

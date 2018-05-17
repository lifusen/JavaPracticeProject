package com.lifusen.www.web.action;

import javax.annotation.Resource;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lifusen.www.entity.User;
import com.lifusen.www.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport{
	
	private User user;
	private String loginName;
	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	private String yan;
	
	public String getYan() {
		return yan;
	}

	public void setYan(String yan) {
		this.yan = yan;
	}

	@Resource(name="userService")
	private UserService us;
	
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserService getUs() {
		return us;
	}

	public void setUs(UserService us) {
		this.us = us;
	}

//	public void validateRegistForm(){
//		super.clearFieldErrors();
//	}
	public String registForm(){
		return SUCCESS;
	}
	
	public String loginForm(){
		return SUCCESS;
	}

	public String regist(){
		if(us.regist(user)==null){
			ActionContext.getContext().put("registTip", "居然注册发生异常了！");
			return ERROR;
		}else{
			ServletActionContext.getRequest().getSession().setAttribute("curuser", user);
			return SUCCESS;
		}
	}
	
	public String login(){
		System.out.println("----");
		User uu= us.login(user);
		if(uu==null){
			ActionContext.getContext().put("loginTip", "对不起，账户或者密码错误1！");
			return ERROR;
		}else{
			ServletActionContext.getRequest().getSession().setAttribute("curuser", uu);
			return SUCCESS;
		}
	}
	
	public String yan(){
		User uu =us.sele(loginName);
		if(uu==null){
			yan="恭喜你，此账户可以注册";
		}else if(loginName==""){
			yan="账户名不能为空！";
		}else{
			yan="对不起，此账户已经被注册";
		}
		return SUCCESS;
	}
	
	public String loginout(){
		ServletActionContext.getRequest().getSession().invalidate();
		return SUCCESS;
	}
}

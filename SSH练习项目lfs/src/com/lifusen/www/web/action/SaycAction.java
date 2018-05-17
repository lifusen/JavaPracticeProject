package com.lifusen.www.web.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lifusen.www.entity.Sayc;
import com.lifusen.www.service.SaycService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@Controller("saycAction")
@Scope("prototype")
public class SaycAction extends ActionSupport{
	
	private Sayc sayc;
	@Resource(name="saycService")
	private SaycService ss;
	
	public Sayc getSayc() {
		return sayc;
	}
	public void setSayc(Sayc sayc) {
		this.sayc = sayc;
	}
	public SaycService getUs() {
		return ss;
	}
	public void setUs(SaycService ss) {
		this.ss = ss;
	}
	public String regist() {
		ActionContext.getContext().put("says", ss.login());
			return SUCCESS;
		}
	public String login(){
		System.out.println(sayc);
		if(ss.regist(sayc)==null){
			return ERROR;
		}else{
			return SUCCESS;
		}
	}
	
	
}

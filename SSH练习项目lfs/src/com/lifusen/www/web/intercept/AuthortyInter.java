package com.lifusen.www.web.intercept;

import org.springframework.stereotype.Repository;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

@SuppressWarnings("serial")
@Repository("auth")
public class AuthortyInter extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		ActionContext act =arg0.getInvocationContext();
		if(act.getSession().get("curuser")==null){
			act.put("authTip", "请登录后再进行该操作！");
			return "login";
		}else{
			arg0.invoke();
		}
		return null;
	}

}

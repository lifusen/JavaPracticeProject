package com.lfs.www.web.controller;




import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.lfs.www.entity.TblPhone;
import com.lfs.www.entity.TblUser;
import com.lfs.www.entity.TblUserExample;
import com.lfs.www.entity.TblUserExample.Criteria;
import com.lfs.www.service.PhoneService;
import com.lfs.www.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource(name="UserService")
	UserService us;
	
	@Resource(name="PhoneService")
	PhoneService ps;
	
	@RequestMapping("/userRegistForm")
	public String registForm(){
		return "user/userRegist";
	}
	
	@RequestMapping("/userLoginForm")
	public String loginForm(){
		return "user/userLogin";
	}

	@RequestMapping("/userLogin")
	public String login(@Valid TblUser tblUser,BindingResult bindingResult,HttpSession session,Map<String,Object> map){
//		if(bindingResult.hasErrors()){
//			return "user/userRegist";
//		}
		
		TblUserExample tue = new TblUserExample();
		Criteria cri = tue.createCriteria();
		cri.andLoginnameEqualTo(tblUser.getLoginname());
		cri.andLoginpwdEqualTo(tblUser.getLoginpwd());
		
		List<TblUser> user =us.selectByExample(tue);
		
		if(user==null||user.size()==0){
			map.put("loginTip", "账户或者密码错误！"); 
			return "user/userLogin";
		}else{
			session.setAttribute("curUser", user.get(0));
			return "redirect:/index";
			}
	}
	
	@RequestMapping(value="/userRegist")
	public String regist(@Validated TblUser tblUser,BindingResult bindingResult,TblPhone phone,Map<String,Object> map){
		if(bindingResult.hasErrors()){
			List<ObjectError> ls =bindingResult.getAllErrors();
			for(ObjectError error:ls){
				System.out.println("--"+error+"--");
			}
			return "user/userRegist";
		}
		
		int result = us.insert(tblUser);
		phone.setUid(tblUser.getId());
		int result1 = ps.insert(phone);
		if(result>0&&result1>0){
			return "redirect:/user/userLoginForm";
		}else{
			map.put("registTip", "注册时发生未知异常！");
			return "user/userRegist";
		}
	}
	
	@RequestMapping("useryan")
	public  @ResponseBody String userYan(){
		Map map = new HashMap<String,String>();
		map.put("ccc", "11111");
		return JSON.toJSONString(map);
	}
	
	@RequestMapping("/userLoginOut")
	public String loginOut(HttpSession session){
		session.invalidate();
		return "redirect:/index";
	}
	
}

package com.lfs.www.web.controller;


import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lfs.www.entity.TblSayc;
import com.lfs.www.service.SaycService;

@Controller
@RequestMapping("/sayc")
public class SaycController {
	@Resource
	SaycService us;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@RequestMapping("/saycRegistForm")
	public String registForm(Map map){
		map.put("saycs",us.selectSaycs());
		return "sayc/saycRegist";
	}
	
	@RequestMapping("/saycLogin")
	public String regist(TblSayc sayc){
		us.insert(sayc);
		return "redirect:/sayc/saycRegistForm";
	}

	
}

package com.lifusen.www.web.action;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.lifusen.www.util.WeatherInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.com.webxml.Wsweather;

@SuppressWarnings("serial")
@Controller("commonAction")
@Scope("prototype")
public class commonAction extends ActionSupport {
	
	public String index(){
		System.out.println("------");
	//		List<String> list = Wsweather.getWeather("成都");
			String list = WeatherInfo.GetWeatherData("成都");
			ActionContext.getContext().put("weather",list);
		
		return SUCCESS;
	}

}

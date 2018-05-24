package com.lfs.www.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lfs.www.util.WeatherInfo;

import cn.com.webxml.Wsweather;

@Controller
@RequestMapping("/index")
public class CommonController {

	
	@RequestMapping("")
	public String toIndex(HttpServletRequest request,Model model){
		//List<String> list = Wsweather.getWeather("成都");
		String list = WeatherInfo.GetWeatherData("成都");
		model.addAttribute("weather",list);
		return "common/index";
	}
}

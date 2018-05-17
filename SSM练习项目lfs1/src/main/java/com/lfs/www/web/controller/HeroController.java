package com.lfs.www.web.controller;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.lfs.www.entity.TblHero;
import com.lfs.www.service.HeroService;

@Controller
@RequestMapping("/hero")
public class HeroController {
	@Resource(name="HeroService")
	HeroService hs;
	
	@RequestMapping("/heroRegistForm")
	public String registForm(){
		return "hero/heroRegist";
	}
	
	@RequestMapping("/heroLoginForm")
	public String loginForm(Model model){
		model.addAttribute("list",hs.selectHeros());
		return "hero/heroLogin";
	}
	
	@RequestMapping("/heroRegist")
	public String regist(MultipartFile file,TblHero hero,HttpServletRequest request) throws IllegalStateException, IOException{
		if(!file.isEmpty()){
			String fileName=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+".jpg";
			String path = request.getSession().getServletContext().getRealPath("/upload/")+fileName;
			file.transferTo(new File(path));
			hero.setSrcPhoto("/upload/"+fileName);
		}
		hs.insert(hero);
		return "hero/heroRegist";
	}
	
	@RequestMapping("/download")
	public ResponseEntity<byte[]>down(String src,String name,HttpServletRequest request) throws IOException{
		String path=request.getSession().getServletContext().getRealPath("")+src;
		 System.out.println(path);
		 String dfileName = new String((name+".jpg").getBytes("gb2312"), "iso8859-1");
		 HttpHeaders headers = new HttpHeaders();
		 headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		 headers.setContentDispositionFormData("attachment", dfileName); 
		 
		 return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(new File(path)), headers, HttpStatus.CREATED);
	}
}

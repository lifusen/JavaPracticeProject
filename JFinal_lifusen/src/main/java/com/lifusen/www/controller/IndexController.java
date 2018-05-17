package com.lifusen.www.controller;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;
import com.lifusen.www.interceptor.SeeViewPathInterceptor;

@Before(SeeViewPathInterceptor.class)
public class IndexController extends Controller
{
  public void index()
  {
    render("index.html");
  }
}
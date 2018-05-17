package com.lifusen.www.config;

import com.jfinal.config.Routes;
import com.lifusen.www.controller.IndexController;

public class FrontRoute extends Routes
{
  public void config()
  {
    setBaseViewPath("/WEB-INF/index");
    add("/", IndexController.class);
  }
}
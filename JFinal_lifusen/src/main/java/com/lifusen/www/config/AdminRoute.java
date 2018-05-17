package com.lifusen.www.config;

import com.jfinal.config.Routes;
import com.lifusen.www.controller.UserController;

public class AdminRoute extends Routes
{
  public void config()
  {
	//setBaseViewPath("/WEB-INF/user");
    add("/user", UserController.class, "/WEB-INF/user");
  }
}
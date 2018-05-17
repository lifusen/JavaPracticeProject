package com.lifusen.www.config;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.lifusen.www.user.Dengji;
import com.lifusen.www.user.User;

public class _MappingKit
{
  public static void add(ActiveRecordPlugin me)
  {
    me.addMapping("user", User.class);
    me.addMapping("dengji", Dengji.class);
  }
}
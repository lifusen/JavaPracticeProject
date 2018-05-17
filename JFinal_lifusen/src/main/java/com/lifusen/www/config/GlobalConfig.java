package com.lifusen.www.config;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.interceptor.SessionInViewInterceptor;
import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.c3p0.C3p0Plugin;
import com.jfinal.plugin.ehcache.EhCachePlugin;
import com.jfinal.template.Engine;

public class GlobalConfig extends JFinalConfig
{
  public void configConstant(Constants me)
  {
    me.setDevMode(true);
    me.setBaseUploadPath("/upload/");
  }

  public void configRoute(Routes me)
  {
    me.add(new AdminRoute());
    me.add(new FrontRoute());
  }

  public void configEngine(Engine me)
  {
    me.addSharedFunction("/WEB-INF/common/head.html");
  }

  public void configPlugin(Plugins me)
  {
    me.add(new EhCachePlugin());

    Prop prop = PropKit.use("jdbc.txt");
    C3p0Plugin c3p0Plugin = new C3p0Plugin(prop.get("jdbcUrl"), prop.get("user"), prop.get("password"));
    me.add(c3p0Plugin);
    ActiveRecordPlugin activeRecordPlugin = new ActiveRecordPlugin(c3p0Plugin);
    me.add(activeRecordPlugin);
    _MappingKit.add(activeRecordPlugin);
  }

  public void configInterceptor(Interceptors me)
  {
    me.add(new SessionInViewInterceptor());
  }

  public void configHandler(Handlers me)
  {
  }
}
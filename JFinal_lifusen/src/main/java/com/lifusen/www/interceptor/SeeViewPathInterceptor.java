package com.lifusen.www.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import java.io.PrintStream;

public class SeeViewPathInterceptor
  implements Interceptor
{
  public void intercept(Invocation inv)
  {
    System.out.println("请求路径：" + inv.getControllerKey());
    System.out.println("请求处理：" + inv.getController().getClass().getName());
    System.out.println("请求方法：" + inv.getActionKey());
    System.out.println("视图路径：" + inv.getViewPath());
    System.out.println("请求参数：" + inv.getArgs().toString());
    inv.invoke();
  }
}
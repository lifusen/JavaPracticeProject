package com.lifusen.www.interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;
import java.io.PrintStream;

public class AuthorityInterceptor
  implements Interceptor
{
  public void intercept(Invocation inv)
  {
    System.out.println("权限验证开始！");

    Controller controller = inv.getController();
    String flag = (String)controller.getSessionAttr("userName");
    if (flag == null)
      controller.render("index.html");
    else {
      inv.invoke();
    }
    System.out.println("权限验证结束！");
  }
}
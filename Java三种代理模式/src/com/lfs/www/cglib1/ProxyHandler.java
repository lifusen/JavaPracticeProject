package com.lfs.www.cglib1;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class ProxyHandler implements MethodInterceptor{

	//维护目标对象
    private Object target;

    //给目标对象创建一个代理对象
    public Object getProxyInstance(Object target){
    	this.target = target;
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return en.create();
    }
    
	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		System.out.println("原对象方法调用前处理信息");  
        //执行目标对象的方法
        Object returnValue = arg1.invoke(target, arg2);
        System.out.println("原对象方法调用后处理信息"); 
        return returnValue;
	}

}

package com.atguigu.java2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class XiaoMi implements InvocationHandler {

    private Object targetObject;

    public XiaoMi(){

    }

    public Object getXiaoMi(Object targetObject){
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
                targetObject.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始了");
        Object invoke = method.invoke(targetObject, args);
        System.out.println("代理结束了");
        return invoke;
    }
}

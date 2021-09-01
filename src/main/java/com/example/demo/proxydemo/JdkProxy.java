package com.example.demo.proxydemo;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

//https://www.cnblogs.com/wuyuegb2312/p/13150201.html
public class JdkProxy implements InvocationHandler {
    private Object target ;//需要代理的目标对象

    //定义获取代理对象方法
    // 因为只是在main()里测试，声明为private了
    private Object getJDKProxy(Object targetObject){
        this.target = targetObject;
        return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
    }

    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy();
        UserManager user = (UserManager) jdkProxy.getJDKProxy(new UserManagerImpl());//获取代理对象
        user.addUser("admin","admin12345");
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("JDK动态代理，监听开始！");
        Object result = method.invoke(target, objects);
        System.out.println("JDK动态代理，监听结束！");
        return result;
    }
}

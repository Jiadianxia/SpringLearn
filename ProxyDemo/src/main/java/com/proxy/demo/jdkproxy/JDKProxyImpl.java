package com.proxy.demo.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * <p>
 * <p>
 * 利用jdk动态代理的生成代理对象的前提是
 * 被代理对象必须实现了一个或多个接口，
 * 这样才能够运用jdk动态代理。
 * 所以对于那些没有实现接口的类，该怎么处理呢？？？
 * 不急，不是还有cglib动态代理嘛！
 * </p>
 *
 * @author jiadianxia001
 * @since 2019/4/2
 */

public class JDKProxyImpl implements InvocationHandler {
    private Object target;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("学习之前需要预习");
        Object result = method.invoke(target, args);
        System.out.println("学习之后需要复习");
        return result;
    }

    public Object getProxyClass(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
        //这里的this是指代实现了InvocationHandler接口的实现类
    }
}

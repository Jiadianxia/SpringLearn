package com.proxy.demo.cglibproxy;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * <p>
 * <p>
 * </p>
 *
 * @author jiadianxia001
 * @since 2019/4/2
 */

public class CglibProxyImpl implements MethodInterceptor {
    //
    private Object target;

    @Override
    public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("学习之前要提前预习！");
        arg3.invokeSuper(arg0, arg2);
        System.out.println("学习之后要及时的进行复习");
        return null;
    }
    // 注意动态代理和静态代理的区别，这里的对象是不固定的，因为他是在代码运行时动态生成的
    public Object getCglibProxy(Object target){
        this.target=target;
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(this);
        enhancer.setSuperclass(this.target.getClass());
        return enhancer.create();
    }
}

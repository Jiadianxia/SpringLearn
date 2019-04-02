package com.proxy.demo.jdkproxy;

import com.proxy.demo.staticproxy.DemoService;
import com.proxy.demo.staticproxy.DemoServiceImpl;

/**
 * <p>
 * <p>
 * </p>
 *002、JDK动态代理 局限性：被代理的对象必须实现一个或多个接口
 * @author jiadianxia001
 * @since 2019/4/2
 */

public class JDKProxyTest {
    public static void main(String[] args) {
        JDKProxyImpl jDKProxyImpl = new JDKProxyImpl();
        DemoService studentInterface = (DemoService) jDKProxyImpl.
                getProxyClass(new DemoServiceImpl());
        studentInterface.sayHello();
    }
}

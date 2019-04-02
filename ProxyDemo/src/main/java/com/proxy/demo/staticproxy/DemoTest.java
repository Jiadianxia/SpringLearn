package com.proxy.demo.staticproxy;

/**
 * <p>
 * <p>
 * </p>
 * 001、静态代理
 * @author jiadianxia001
 * @since 2019/4/2
 */

public class DemoTest {
    public static void main(String[] args) {
        DemoService demoService = new DemoServiceImpl();
        ProxyForDemo proxyForDemo = new ProxyForDemo(demoService);
        proxyForDemo.sayHello();
    }
}

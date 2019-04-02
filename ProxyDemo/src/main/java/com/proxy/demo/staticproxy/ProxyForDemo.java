package com.proxy.demo.staticproxy;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author jiadianxia001
 * @since 2019/4/2
 */

//静态代理
public class ProxyForDemo implements DemoService{
    private  DemoService demoService;

    //有了此构造方法，默认无参数的构造方法不起作用
    public ProxyForDemo(DemoService demoService){
        this.demoService = demoService;
    }
    @Override
    public void sayHello() {
        System.out.println("我是明星的代理人，声明有我代理发出");
    }
}

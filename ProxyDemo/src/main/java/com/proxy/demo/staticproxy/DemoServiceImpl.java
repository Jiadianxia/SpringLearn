package com.proxy.demo.staticproxy;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author jiadianxia001
 * @since 2019/4/2
 */

public class DemoServiceImpl implements DemoService {
    @Override
    public void sayHello() {
        System.out.println("我是明星，对声明是透明的");
    }
}

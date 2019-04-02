package com.proxy.demo.cglibproxy;

/**
 * <p>
 * <p>
 * </p>
 * 003、cglib动态代理 局限性，被final修饰的类和方法不能被其代理（采用被代理类生成子类的方式实现动态代理）
 *
 * @author jiadianxia001
 * @since 2019/4/2
 */

public class CglibProxyTest {
    public static void main(String[] args) {
        CglibProxyImpl cglibProxyImpl = new CglibProxyImpl();
        StudentInterfaceImpl studentInterfaceImpl = (StudentInterfaceImpl) cglibProxyImpl.
                getCglibProxy(new StudentInterfaceImpl());
        studentInterfaceImpl.study();
    }
}

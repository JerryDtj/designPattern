package proxy.dynamicproxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 *
 * @author Jerry
 * @Date 2019-07-14 22:34
 */
public class JavaDyProxyClient {
    public static void main(String[] args) {
        Thesis thesis = new Writer();
        InvocationHandler invocationHandler = new ThesisProxy(thesis);
        Thesis proxyInstance = (Thesis) Proxy.newProxyInstance(thesis.getClass().getClassLoader(),thesis.getClass().getInterfaces(),invocationHandler);
        proxyInstance.writing();
    }
}

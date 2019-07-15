package proxy.dynamicproxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Jerry
 * @Date 2019-07-14 22:23
 */
public class ThesisProxy implements InvocationHandler {
    private Thesis thesis;
    ThesisProxy(Thesis thesis){
        this.thesis = thesis;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行动态代理");
        return method.invoke(thesis,args);
    }
}

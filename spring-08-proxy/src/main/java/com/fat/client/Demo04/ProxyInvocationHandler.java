package com.fat.client.Demo04;

import com.fat.client.Demo03.Rent;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author fatsea
 * @date 2022/9/3 - 21:10
 */
// 我们会用这个类自动生成代理类
public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的接口(这里不写死，变成工具类）
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // Proxy提供了创建动态代理类和实例的静态方法
    // 生成得到代理类
    // 1.ClassLoader
    // 2.代理类的接口
    // 3.InvocationHandler（本身就是）
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    // InvocationHandler处理代理实例，并返回结果
    // 执行代理真正要干的事情
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        log(method.getName());
        // 通过反射执行方法
        // 动态代理的本质就是使用反射机制实现
        Object result = method.invoke(target, args);


        return result;
    }

    public void log(String msg) {
        System.out.println("执行了" + msg + "方法");
    }

}

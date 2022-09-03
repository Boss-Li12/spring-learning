package com.fat.client.Demo03;

/**
 * @author fatsea
 * @date 2022/9/3 - 21:17
 */
public class Client {
    // 没有代理类
    public static void main(String[] args) {
        // 真实角色
        Host host = new Host();

        // 代理角色：现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        // 通过调用程序处理角色，来处理我们要调用的接口对象！

        // 设置真实要代理的角色
        pih.setRent(host);

        // 通过方法动态生成代理类
        // 这里的proxy就是动态生成的代理, 我们并没有写
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();
    }
}

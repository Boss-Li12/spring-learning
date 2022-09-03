package com.fat.client.Demo04;

import com.fat.client.Demo02.UserService;
import com.fat.client.Demo02.UserServiceImpl;

import javax.jws.soap.SOAPBinding;

/**
 * @author fatsea
 * @date 2022/9/3 - 21:28
 */
public class Client {
    public static void main(String[] args) {
        // 真实角色
        UserServiceImpl userService = new UserServiceImpl();

        // 代理角色 不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        // 设置要代理的对象
        pih.setTarget(userService);

        // 动态生成代理类
        UserService proxy = (UserService) pih.getProxy();

        proxy.delete();
    }
}

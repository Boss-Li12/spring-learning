package com.fat.client.Demo02;

/**
 * @author fatsea
 * @date 2022/9/3 - 20:44
 */
public class Client {
    // 使用代理不改变原有代码,扩展功能
    // 业务和额外逻辑分离
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();

        proxy.setUserService(userService);
        proxy.add();
    }
}

package com.fat.client.Demo02;

/**
 * @author fatsea
 * @date 2022/9/3 - 20:46
 */

// 代理UserService
public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("add");
        userService.add();
    }

    @Override
    public void update() {
        log("add");
        userService.add();
    }

    @Override
    public void query() {
        log("add");
        userService.add();
    }

    //日志方法
    public void log(String msg) {
        System.out.println("[Debug]使用了" + msg + "方法");
    }
}

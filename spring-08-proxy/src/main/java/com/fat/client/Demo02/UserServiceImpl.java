package com.fat.client.Demo02;

/**
 * @author fatsea
 * @date 2022/9/3 - 20:43
 */
public class UserServiceImpl implements UserService{
    @Override
    public void add() {
        System.out.println("add user");
    }

    @Override
    public void delete() {
        System.out.println("delete user");
    }

    @Override
    public void update() {
        System.out.println("update user");
    }

    @Override
    public void query() {
        System.out.println("query user");
    }

    //1.改动原有的业务代码，在公司中是大忌
}

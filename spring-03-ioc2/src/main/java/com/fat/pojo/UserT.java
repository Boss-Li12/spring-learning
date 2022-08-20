package com.fat.pojo;

/**
 * @author fatsea
 * @date 2022/8/9 - 22:19
 */
public class UserT {
    private String name;

    public UserT() {
        System.out.println("UserT被创建了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("name = " + name);
    }
}

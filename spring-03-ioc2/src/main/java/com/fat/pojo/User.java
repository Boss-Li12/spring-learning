package com.fat.pojo;

/**
 * @author fatsea
 * @date 2022/8/9 - 21:54
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
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

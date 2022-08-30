package com.fat.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author fatsea
 * @date 2022/8/30 - 22:08
 */
//这个注解就是说明这个类被Spring接管了
//注册到了容器中
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("肥海123") //属性注入
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}

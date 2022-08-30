package com.fat.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author fatsea
 * @date 2022/8/29 - 23:01
 */

// 等价于注册了一个bean
// 主键
@Component
@Scope("singleton")
public class User {

    // 相当于bean里面的property
    @Value("肥海123321")
    public String name;

    public void setName(String name) {
        this.name = name;
    }
}

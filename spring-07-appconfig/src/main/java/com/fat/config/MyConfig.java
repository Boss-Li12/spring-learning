package com.fat.config;

import com.fat.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @author fatsea
 * @date 2022/8/30 - 22:10
 */
// 因为他本来就是一个@Component
// 代表这是一个配置类，和beans.xml是一样的
@Configuration //这个也会被Spring托管，注册到容器中
@ComponentScan("com.fat.pojo")
@Import(MyConfig2.class) // 导入
public class MyConfig {

    //注册一个bean相当于之前写的一个bean标签
    //ID就是这个方法的名字
    //class就是这个方法的返回值
    @Bean
    public User xxxUser(){
        return new User();//就是返回要注入到bean中的对象
    }
}


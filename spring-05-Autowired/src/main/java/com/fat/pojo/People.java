package com.fat.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author fatsea
 * @date 2022/8/20 - 21:34
 */
public class People {
    // 这个对象可以为null，否则不允许为空
    // @Resource(name = "xxx")j
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    @Qualifier(value="dog222")
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }

    public Dog getDog() {
        return dog;
    }


//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}

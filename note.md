## 常用依赖
```xml
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.3.22</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
```
## bean.xml配置
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd">


    <context:annotation-config/>
</beans>
```

## 注解说明
- @Autowired: 自动装配通过类型、名字
    如果Autowired不能唯一自动装配上属性，则需要通过@Qualifies(value = "xxx")
- @Resource: 自动装配通过名字、类型
- @Nullable: 字段标记了这个注解，说明这个字段可以为null
- @Component: 组件，放在类上，说明这个类被Spring管理了，就是bean
  - 在web开发，会按照mvc三层架构分层
  - dao【@Repository】
  - service【@Service】
  - controller【@Controller】
  - 这四个注解功能一样，都代表将某个类注册到Spring容器中，然后装配bean
- @Value: 注入值
- @Scope("singleton"): 作用域

## 最佳实践
xml用来管理bean, 注解用来执行属性的注入, 开启注解的支持（扫描包 + 开启注解支持）
```xml
    <!--这个包下的注解就会生效-->
    <context:component-scan base-package="com.fat"/>
    <context:annotation-config/>```

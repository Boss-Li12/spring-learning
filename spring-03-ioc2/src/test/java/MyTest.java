import com.fat.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fatsea
 * @date 2022/8/9 - 21:56
 */
public class MyTest {
    public static void main(String[] args) {

        //Spring容器类似于婚介网站，对象已经存在了
        //注册（配置文件加载）的时候已经被实例化了
        //get都是同一个
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        User user1 = (User) context.getBean("user");
        User user2 = (User) context.getBean("user");
        System.out.println(user1 == user2); // 默认单例模式
//        user1.show();

    }
}

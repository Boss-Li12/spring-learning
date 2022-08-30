import com.fat.config.MyConfig;
import com.fat.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author fatsea
 * @date 2022/8/30 - 22:12
 */
public class MyTest {
    public static void main(String[] args) {
        // 如果完全使用了配置类方式
        // 我们就只能通过AnnotationConfig来获取容器
        // 通过配置类的class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        // 名字保持一致
        User getUser = (User) context.getBean("xxxUser");
        System.out.println(getUser.getName());
    }
}

import com.fat.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fatsea
 * @date 2022/8/8 - 21:25
 */
public class MyTest {
    public static void main(String[] args) {
        // 获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 对象都在Spring中管理，要使用直接去里面取出来
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}

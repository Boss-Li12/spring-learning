import com.fat.pojo.Student;
import com.fat.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fatsea
 * @date 2022/8/15 - 21:49
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }
    /*
    Student{
        name='fatsea',
        address=Address{address='广州'},
        books=[红楼梦, 西游记, 水浒传, 三国演义],
        hobbys=[听歌, 打代码, 看电影],
        card={身份证=xxxx, 银行卡=xxxx},
        games=[LOL, CF, KPL],
        info={学号=xxxxxxxx, 性别=男, 姓名=fatsea},
        wife='null'}
     */
    @Test
    public void test2() {
        ApplicationContext contest = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = contest.getBean("user2", User.class);
        System.out.println(user);
    }
}

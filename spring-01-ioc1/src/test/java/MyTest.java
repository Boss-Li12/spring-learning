import com.fat.dao.UserDaoImpl;
import com.fat.dao.UserDaoMysqlImpl;
import com.fat.service.UserService;
import com.fat.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author fatsea
 * @date 2022/8/7 - 23:06
 */
public class MyTest {
    public static void main(String[] args) {
        // servelet调业务层的业务,非DAO层
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl) userService).setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();
        // 获取ApplicationContext， 拿到Spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，需要什么，就直接get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");

        userServiceImpl.getUser();
    }
}

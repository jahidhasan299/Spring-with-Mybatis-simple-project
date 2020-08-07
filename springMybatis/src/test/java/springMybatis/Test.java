package springMybatis;
import com.sys.pojo.User;
import com.sys.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = ac.getBean(UserService.class);
//        try {
//            userService.addUser(new User(128,"Jack2","789","man","jackie2"));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            int num = userService.deleteUser(49);
            if (num == 1) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
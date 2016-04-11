import com.mmj.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MaMingJiang on 2016/4/11.
 */
public class AppMain {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello)application.getBean("hello2");
        hello.say();
    }
}

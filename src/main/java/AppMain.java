import com.mmj.Hello;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by MaMingJiang on 2016/4/11.
 */
public class AppMain {
    public static void main(String[] args) throws IOException {
        ApplicationContext application = new ClassPathXmlApplicationContext("hello-beans.xml");
        //1 使用<property name="hello1" value="Hello World!"/>
        Hello hello1 = (Hello)application.getBean("hello1");
        hello1.say();
        //2 使用<constructor-args index="0" value="Brian"/>
        Hello hello2 = (Hello)application.getBean("hello2");
        hello2.say();
        //3 使用静态工厂方式实例化Bean
        Hello hello3 = (Hello)application.getBean("hello3");
        hello3.say();
        //4 使用实例工厂方式实例化Bean
        Hello hello4 = (Hello)application.getBean("hello4");
        hello4.say();

    }
}

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-06 23:33
 */
public class class09Test {

    @Test
    public void test(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean bean = context.getBean("bean",Bean.class);

        System.out.println("bean = "+ bean);
        context.close();
    }
}

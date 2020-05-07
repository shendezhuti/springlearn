import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-06 20:02
 */
public class class08Test {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("context被创建");
        Bean bean = context.getBean("bean",Bean.class);
        System.out.println("bean = "+bean);
    }
}

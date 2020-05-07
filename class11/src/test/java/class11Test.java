import class11.Bean1;
import class11.Myconfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-07 02:15
 */
public class class11Test {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Myconfiguration.class);
        Bean1 bean1 = context.getBean("bean1",Bean1.class);
        System.out.println("bean1 = "+ bean1);
    }
}

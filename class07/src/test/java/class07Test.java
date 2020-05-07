import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-06 18:43
 */
public class class07Test {

    @Test
    public  void test() {
        
        final ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        for (int i = 0; i < 10; i++) {
            Bean bean = context.getBean("bean", Bean.class);
            System.out.println("bean="+ bean);
        }

        System.out.println("---------");
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    Bean bean = context.getBean("bean", Bean.class);
                    System.out.println("bean="+ bean);
                }
            }).start();
        }
        
    }
}

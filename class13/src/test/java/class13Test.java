import class13.TestBean;
import class13.TestConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-08 01:10
 */
public class class13Test {

    @Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);
//        for (int i = 0; i < 10; i++) {
//            TestBean testBean1 = context.getBean("testBean1",TestBean.class);
//            System.out.println("testBean1"+testBean1);
//        }
//        System.out.println("============");
//        for (int i = 0; i < 10; i++) {
//            TestBean testBean2 = context.getBean("testBean2",TestBean.class);
//            System.out.println("testBean2"+testBean2);
//        }

        TestBean testBean2 = context.getBean("testBean2",TestBean.class);
        for (int i = 0; i < 10; i++) {
            testBean2.printAnotherBean();
        }

    }
}

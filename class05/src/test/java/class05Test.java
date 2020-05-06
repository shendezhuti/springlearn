import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-06 14:35
 */
public class class05Test {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean2 bean2_1 = context.getBean("bean2",Bean2.class);
        System.out.println("bean2_1 ="+bean2_1);
        Bean2 bean2_2 = context.getBean("bean2",Bean2.class);
        System.out.println("bean2_2 = "+bean2_2);
        Bean1 bean1 = context.getBean("bean1",Bean1.class);
        System.out.println("bean1 = "+bean1);


//        ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
//        Bean2 bean2_3 = context1.getBean("bean2",Bean2.class);
//        System.out.println("bean2_1 ="+bean2_1);
//        Bean2 bean2_4 = context1.getBean("bean2",Bean2.class);
//        System.out.println("bean2_2 = "+bean2_2);

    }
}

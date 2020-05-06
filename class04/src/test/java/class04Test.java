import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-06 11:26
 */
public class class04Test {

    @Test
    public  void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean bean = context.getBean("bean",Bean.class);
        System.out.println("getStringList="+bean.getStringList());
        System.out.println("getStringSet="+bean.getStringSet());
        System.out.println("getStringMap="+bean.getStringMap());
        System.out.println("getAnotherBeanSet="+bean.getAnotherBeanSet());
        System.out.println("getAnotherBeanList="+bean.getAnotherBeanList());
        System.out.println("getAnotherBeanmap="+bean.getAnotherBeanmap());
        System.out.println("getProperties="+bean.getProperties());
        System.out.println("getAnotherBean2="+bean.getAnotherBean2());

    }
}

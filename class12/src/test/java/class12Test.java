import class12.AnotherBean;
import class12.MyBean;
import class12.MyConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-07 22:47
 */
public class class12Test {

    @Test
    public void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        MyBean myBean = context.getBean("myBean", MyBean.class);
        System.out.println("myBean =  " + myBean);
        for (String s : myBean.getStringList()) {
            System.out.println("s = "+ s);
        }

        for (Map.Entry<String, Integer> entry : myBean.getIntegerMap().entrySet()) {
            System.out.println("entry "+entry);
        }
        AnotherBean anotherBean3 = myBean.getGetAnotherBean3();
        System.out.println("anotherBean3 ="+anotherBean3);
       AnotherBean anotherBean =  myBean.getContext().getBean("anotherBean", AnotherBean.class);
        System.out.println("anotherBean ="+anotherBean);
    }
}

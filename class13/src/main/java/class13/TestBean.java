package class13;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-08 00:59
 */

@Component("testBean2")
@Scope("singleton")
public abstract class TestBean
{
    @Lookup
    public abstract AnotherBean anotherBean();

    public void printAnotherBean(){
        System.out.println("anotherBean"+anotherBean());
    }

}

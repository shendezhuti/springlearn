import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-06 23:32
 */
public class Bean implements InitializingBean, DisposableBean {

    public void onInit(){
        System.out.println("bean.onInit");
    }

    public void onDestory(){
        System.out.println("bean.onDestroy");
    }


    public void destroy() throws Exception {
        System.out.println("bean.destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("bean.afterpropertiesSet");
    }
}

import car.Audi;
import car.Buick;
import human.Humen;
import human.LiSi;
import human.ZhangSan;
import org.junit.Before;
import org.junit.Test;
/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-05 23:12
 */
public class IocContainerTest {

    private IocContainer iocContainer = new IocContainer();

    @Before
    public void before(){
        iocContainer.setBean(Audi.class,"audi");
        iocContainer.setBean(Buick.class,"buick");
        iocContainer.setBean(ZhangSan.class,"zhangsan","audi");
        iocContainer.setBean(LiSi.class,"lisi","buick");
    }

    @Test
    public void test(){
        Humen zhangsan = (Humen) iocContainer.getBean("zhangsan");
        zhangsan.goHome();

        Humen lisi = (Humen) iocContainer.getBean("lisi");
        lisi.goHome();
    }

}
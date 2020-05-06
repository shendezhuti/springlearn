import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 * 1.实例化bean
 * 2.保存bean
 * 3.提供bean
 *
 * 4.每一个bean产生一个唯一的id与之相对应
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-05 15:21
 */
public class IocContainer {

    private Map<String,Object> beans = new ConcurrentHashMap<String, Object>();

    /**
     * 根据beanId获取一个Bean
     * @param beanId
     * @return 返回bean
     */
    public Object getBean(String beanId){
        return beans.get(beanId);
    }

    /**
     * 委托ioc容器创建一个bean
     * @param clazz 要创建的bean的class
     * @param beanId beanID
     * @param paramBeanIds 要创建的bean的class的构造方法所需要的构造方法的beanId们
     */
    public void setBean(Class<?>clazz, String beanId ,String ... paramBeanIds){
        //1.组装构造方法锁需要的参数值
        Object[]paramValues = new Object[paramBeanIds.length];

        for(int i=0;i<paramBeanIds.length;i++){
            paramValues[i] = beans.get(paramBeanIds[i]);
        }

        //2.调用构造方法实例化bean
        Object bean = null;

        for (Constructor<?> constructor : clazz.getConstructors()) {
            try {
                bean = constructor.newInstance(paramValues);
            } catch (InstantiationException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
            if(bean == null) {
                throw  new RuntimeException("找不到合适的方法去实例化bean");
            }
        }

        //3.将实例化的bean放入beans
        beans.put(beanId,bean);

    }


}

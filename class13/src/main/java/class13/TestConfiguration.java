package class13;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-08 00:59
 */
@Configuration
@ComponentScan("class13")
public class TestConfiguration {

//    @Bean("testBean1")
//    @Scope("myScope")
//        public TestBean testBean(){
//            return new TestBean();
//        }

      @Bean
      public  MyScope myScope(){
        return new MyScope();
      }

      @Bean
      public CustomScopeConfigurer customScopeConfigurer(){
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("myScope",myScope());
        return configurer;
      }
}

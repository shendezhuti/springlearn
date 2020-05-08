package class12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ZEXIN HUANG
 * @version 1.0
 * @date 2020-05-07 22:46
 */
@Configuration
@ComponentScan("class12")
public class MyConfiguration {


    @Bean
    public Map<String,Integer> integerMap(){
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("aaa",111);
        map.put("bbb",222);
        return map;
    }

    @Bean
    public List<String> stringList(){
        List<String> list = new ArrayList<String>();
        list.add("111");
        list.add("222");
        return list;
    }

    @Bean
    public String string1(){
        return "333";
    }

    @Bean
    public String string2(){
        return "222";
    }

}

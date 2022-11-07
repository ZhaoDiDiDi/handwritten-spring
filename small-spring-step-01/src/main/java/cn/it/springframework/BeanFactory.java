package java.cn.it.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap();

    //注册bean
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        this.beanDefinitionMap.put(name, beanDefinition);
    }

    //获取bean
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }
}

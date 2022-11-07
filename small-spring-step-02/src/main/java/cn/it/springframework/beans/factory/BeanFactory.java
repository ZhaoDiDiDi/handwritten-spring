package cn.it.springframework.beans.factory;
import cn.it.springframework.beans.BeansException;
import cn.it.springframework.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface BeanFactory {

    public Object getBean(String name) throws BeansException;
}

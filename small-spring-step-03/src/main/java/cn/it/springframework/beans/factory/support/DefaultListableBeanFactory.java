package main.java.cn.it.springframework.beans.factory.support;

import main.java.cn.it.springframework.beans.BeansException;
import main.java.cn.it.springframework.beans.factory.config.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * 核心实现类 接口定义了注册，抽象类定义了获取
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {

    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        //记录注册时的Class 在缓存中查找不到的时候获取
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws BeansException {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeansException("No bean name '" + beanName + "' is defined");
        }
        return beanDefinition;
    }
}

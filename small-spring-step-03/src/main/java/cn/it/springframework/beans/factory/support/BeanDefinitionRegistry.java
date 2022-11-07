package main.java.cn.it.springframework.beans.factory.support;

import main.java.cn.it.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}

package cn.it.springframework.beans.factory.support;

import cn.it.springframework.beans.BeansException;
import cn.it.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        // new Enhancer();
        return null;
    }
}

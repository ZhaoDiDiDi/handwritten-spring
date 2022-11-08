package cn.it.springframework.beans.factory.support;

import cn.it.springframework.beans.BeansException;
import cn.it.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 定义实例化策略接口
 */
@SuppressWarnings({"rawtypes"})
public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}

package cn.it.springframework.beans.factory.support;

import cn.it.springframework.beans.BeansException;
import cn.it.springframework.beans.factory.config.BeanDefinition;

/**
 * 实例化Bean类
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            //通过反射创建
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed",e);
        }
        //实例完后放入单例对象缓存中
        addSingleton(beanName,bean);
        return bean;
    }
}

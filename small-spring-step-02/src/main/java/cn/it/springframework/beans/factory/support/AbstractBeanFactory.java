package cn.it.springframework.beans.factory.support;

import cn.it.springframework.beans.factory.BeanFactory;
import cn.it.springframework.beans.BeansException;
import cn.it.springframework.beans.factory.config.BeanDefinition;

/**
 * 抽象类定义模板方法
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegsitry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        //在缓存中拿到bean
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        //缓存中不存在则注册方法中拿到Class 创建bean 并加入缓存
        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;
}

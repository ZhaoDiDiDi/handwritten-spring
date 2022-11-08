package cn.it.springframework.beans.factory.support;

import cn.it.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例注册接口实现以及缓存
 */
public class DefaultSingletonBeanRegsitry implements SingletonBeanRegistry {

    private Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    /**
     * 实现了一个受保护的 addSingleton 方法，这个方法可以被继承此类的其他类调用。包括：AbstractBeanFactory 以及继承的 DefaultListableBeanFactory 调用
     * @param beanName
     * @param singletonObject
     */
    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }
}

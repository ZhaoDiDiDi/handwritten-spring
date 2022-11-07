package main.java.cn.it.springframework.beans.factory.config;

/**
 * 单例注册接口定义
 */
public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);
}

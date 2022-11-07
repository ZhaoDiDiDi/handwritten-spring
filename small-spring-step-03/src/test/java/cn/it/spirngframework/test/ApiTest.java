package test.java.cn.it.spirngframework.test;

import main.java.cn.it.springframework.beans.BeansException;
import main.java.cn.it.springframework.beans.factory.config.BeanDefinition;
import main.java.cn.it.springframework.beans.factory.support.DefaultListableBeanFactory;
import test.java.cn.it.spirngframework.test.bean.UserService;

public class ApiTest {

    public static void main(String[] args) throws BeansException {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();

        //检查是否为单例
        System.out.println("userService = " + userService);
        System.out.println("userService_singleton = " + userService_singleton);

    }
}

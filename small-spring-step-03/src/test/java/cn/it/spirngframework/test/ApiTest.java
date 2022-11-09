package cn.it.spirngframework.test;

import cn.it.springframework.beans.BeansException;
import cn.it.springframework.beans.factory.config.BeanDefinition;
import cn.it.springframework.beans.factory.support.DefaultListableBeanFactory;
import cn.it.spirngframework.test.bean.UserService;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test() throws BeansException {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService","小赵");
        userService.queryUserInfo();
    }
}

package test.java.cn.it.spirngframework.test;

import java.cn.it.springframework.BeanDefinition;
import java.cn.it.springframework.BeanFactory;
import test.java.cn.it.spirngframework.test.bean.UserService;

public class ApiTest {

    public static void main(String[] args) {
        //初始化
        BeanFactory beanFactory = new BeanFactory();
        //注册bean
        beanFactory.registerBeanDefinition("userService", new BeanDefinition(new UserService()));
        //获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");

        userService.queryUserInfo();
    }
}

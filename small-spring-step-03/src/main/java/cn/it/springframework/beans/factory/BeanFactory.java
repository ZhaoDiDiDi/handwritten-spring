package main.java.cn.it.springframework.beans.factory;
import main.java.cn.it.springframework.beans.BeansException;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public interface BeanFactory {

    public Object getBean(String name) throws BeansException;

    public Object getBean(String name,Object... args) throws BeansException;
}

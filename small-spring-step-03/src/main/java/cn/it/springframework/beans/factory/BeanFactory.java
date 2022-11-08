package cn.it.springframework.beans.factory;
import cn.it.springframework.beans.BeansException;

public interface BeanFactory {

    public Object getBean(String name) throws BeansException;

    public Object getBean(String name,Object... args) throws BeansException;
}

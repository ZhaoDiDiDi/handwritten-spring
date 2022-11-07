package main.java.cn.it.springframework.beans.factory.config;

@SuppressWarnings({"rawtypes"})
public class BeanDefinition {

    /**
     * 把Object bean替换为Class 实现把bean的实例化操作放到容器中处理
     */
    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}

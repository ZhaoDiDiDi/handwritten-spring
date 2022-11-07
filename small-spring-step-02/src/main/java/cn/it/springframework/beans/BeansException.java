package cn.it.springframework.beans;

/**
 * 定义bean异常
 */
public class BeansException extends Exception {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg);
    }
}

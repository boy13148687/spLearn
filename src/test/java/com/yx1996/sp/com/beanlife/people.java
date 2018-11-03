package com.yx1996.sp.com.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class people implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {
    private String name;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet方法被实现");
    }

    people() {
        System.out.println("无参构造方法被调用");
    }

    people(String a) {
        System.out.println("有参构造方法被调用");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("你好" + name);
    }
    //inni方法可以不用在bean里面配置init-method="inni"，可以用注解的方式直接配置  如下
//    @PostConstruct
    public void inni() {
        System.out.println("哈哈");
    }
    //同样destroy-method="destory"也可以通过注解配置
//    @PreDestroy
    public void destory(){
        System.out.println("销毁");
    }

    @Override
    //该方法可以给s表示正在被实例化的bean id
    public void setBeanName(String s) {
        System.out.println("setBeanName被调用" + s);
    }

    @Override
    //该方法可以传递beanfactory
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory被调用" + beanFactory);
    }

    @Override
    //该方法可以传递ApplicationContext
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext被调用" + applicationContext);
    }
}

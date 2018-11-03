package com.yx1996.sp.com.beanlife;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class testbeanlifeBeanFactory {
    public static void main(String[] args) {
        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("beanlife.xml"));
        people p = (people) factory.getBean("people");
        p.say();
    }
}

package com.yx1996.sp.com.testioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class testioc {
    public static void main(String[] args) {
        ApplicationContext sc = new ClassPathXmlApplicationContext("application.xml");
//        ApplicationContext sc=new FileSystemXmlApplicationContext(
//                "C:/Users/Administrator/IdeaProjects/spLearn/src/test/resources/application.xml");
//        Student su=(Student)factory.getBean("student");
//        Student su1=(Student)factory.getBean("student");
//        System.out.println(su+"  "+su1);
//以上两种方式属于应用上下文容器中获取，优点：一获取就会创建bean对象处理速度快 缺点：占内存（90%使用率）
//        BeanFactory factory=new XmlBeanFactory(new ClassPathResource("application.xml"));

    }
//使用bean工厂：优点:调用getbean（）时对象才被创建，减少内存的浪费 缺点：处理速度慢
}

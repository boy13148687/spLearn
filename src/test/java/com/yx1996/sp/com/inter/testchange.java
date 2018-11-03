package com.yx1996.sp.com.inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testchange {
    public static void main(String[] args) {
        ApplicationContext sc=new ClassPathXmlApplicationContext("application.xml");
        ValidateUser v=(ValidateUser) sc.getBean("validateUser");
        v.chack();
    }
}

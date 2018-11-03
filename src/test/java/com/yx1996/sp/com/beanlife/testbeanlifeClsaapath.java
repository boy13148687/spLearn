package com.yx1996.sp.com.beanlife;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yx1996.sp.com.testioc.Student;

public class testbeanlifeClsaapath {
    public static void main(String[] args) {
        ApplicationContext sc = new ClassPathXmlApplicationContext("beanlife.xml");
        people p = (people) sc.getBean("people");
        p.say();
//        Student s = (Student) sc.getBean("student");
//        s.haha();
//        people p1 = (people) sc.getBean("people1");
//        p1.say();
//        people p2=(people)sc.getBean("people");
//        p2.say();
//        people p3=(people)sc.getBean("people");
//        p3.say();
//        techer techer=(techer)sc.getBean("techer");
    }
}

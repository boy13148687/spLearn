package com.yx1996.sp;

import com.yx1996.sp.com.util.ApplicationContextutil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testpeople {

    public static void main(String[] args) {
//        ApplicationContext sc=new ClassPathXmlApplicationContext("application.xml");
//        people haha=(people)sc.getBean("people");
//        haha.say();
        ((people)ApplicationContextutil.
                getApplicationContext().getBean("people")).say();

    }


}


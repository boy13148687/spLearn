package com.yx1996.sp.com.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextutil {
    private static ApplicationContext ac = null;

    private ApplicationContextutil() {

    }

    static {
        ac = new ClassPathXmlApplicationContext("application.xml");

    }

    public static ApplicationContext getApplicationContext() {
        return ac;
    }
}

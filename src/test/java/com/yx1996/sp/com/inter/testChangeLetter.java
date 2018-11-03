package com.yx1996.sp.com.inter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class testChangeLetter {
    public static void main(String[] args) {
        //1.使用FileSystemXmlApplicationContext（文件的绝对路径）创建spring对象
//        ApplicationContext sc=new FileSystemXmlApplicationContext(
//                "C:/Users/Administrator/IdeaProjects/spLearn/src/test/resources/application.xml");
        //2.使用ClassPathXmlApplicationContext（文件必须放入resources文件夹中）创建spring对象
        ApplicationContext sc=new ClassPathXmlApplicationContext("application.xml");
        //可以直接转换成接口类型ChangeLetter，这样实现解耦
        ChangeLetter change=(ChangeLetter) sc.getBean("changeletter");
        System.out.println(change.ChangeLetter());

    }
}

package com.yx1996.sp.com.beanlife;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class MyBeanPostProcess implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization方法被调用" + beanName);
//        System.out.println(beanName + "被使用：" + new java.util.Date());
//        FileWriter out;
//        File file = new File("C:/Users/Administrator/Desktop/record.txt");
//        String s = "被调用：";
//        Date date = new Date();
//        try {
//            out = new FileWriter(file,true);
//            out.append(beanName+s + date+"\r\n");
//            out.flush();
//        } catch (Exception e) {
//            System.out.println("写入出错" + e.getMessage());
//        } finally {
////            try {
////                out.close();
////            } catch (IOException i) {
////                i.printStackTrace();
////
////            }
//        }
        return null;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization方法被调用" + beanName);

        return null;
    }
}

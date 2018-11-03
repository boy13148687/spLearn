package com.yx1996.sp.com.testioc;

public class Student {
    private String name;
    public Student(){
        System.out.println("无参的构造方法被创建");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void haha(){
        System.out.println("我是"+name);
    }
}

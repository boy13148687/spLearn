package com.yx1996.sp.com.inter;

public class chackUser1 implements ValidateUser {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void chack() {
        System.out.println("经过xml查找"+name+"用户存在！");
    }
}


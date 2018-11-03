package com.yx1996.sp;

public class people {

    private String name;
    private baibai baibai;

    public com.yx1996.sp.baibai getBaibai() {
        return baibai;
    }

    public void setBaibai(com.yx1996.sp.baibai baibai) {
        this.baibai = baibai;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void say(){
        System.out.println("我叫"+name);
        baibai.saybey();
    }

}

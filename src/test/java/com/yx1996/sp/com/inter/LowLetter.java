package com.yx1996.sp.com.inter;

public class LowLetter implements ChangeLetter{
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String ChangeLetter() {
        return str.toLowerCase();
    }
}

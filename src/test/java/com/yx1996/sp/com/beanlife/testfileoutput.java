package com.yx1996.sp.com.beanlife;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class testfileoutput {
    public static void main(String[] args) {
        FileWriter out = null;
        File file = new File("C://Users//Administrator//Desktop//record.txt");
        String s = "被调用：";
        Date date = new Date();
        try {
            out = new FileWriter(file);
            out.write("haha1111");

        } catch (Exception e) {
            System.out.println("写入出错" + e.getMessage());
        } finally {
            try {
                out.close();
            } catch (IOException i) {
                i.printStackTrace();

            }


        }

    }
}

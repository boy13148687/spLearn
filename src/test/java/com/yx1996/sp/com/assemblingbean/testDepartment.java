package com.yx1996.sp.com.assemblingbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDepartment {
    public static void main(String[] args) {
        ApplicationContext sc =new ClassPathXmlApplicationContext("assemblingbean.xml");
        Department department= (Department) sc.getBean("department");
        System.out.println(department.getName());
        //foreach不仅仅只能用string  还可以是int等
        for(String empName:department.getEmpName()) {
            System.out.println(empName);
        }
        System.out.println("***************这是list的输出****************");
        for (Employee employee:department.getEmployees()) {
            System.out.println(employee.getName()+"");
        }
    }
}

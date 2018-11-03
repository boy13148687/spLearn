package com.yx1996.sp.com.assemblingbean;

import java.util.List;

public class Department {
    private String name;
    private String [] empName;
    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getEmpName() {
        return empName;
    }

    public void setEmpName(String[] empName) {
        this.empName = empName;
    }




}

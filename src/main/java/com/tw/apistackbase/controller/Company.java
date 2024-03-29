package com.tw.apistackbase.controller;

import java.util.List;

public class Company {
    private String companyName;
    private List<Employee> employees;
    private long empployeesNumber;

    public Company(){

    }
    public Company(String name, List<Employee> employees, long empployeesNumber) {
        this.companyName = name;
        this.employees = employees;
        this.empployeesNumber = empployeesNumber;
    }

    public String getcompanyName() {
        return companyName;
    }

    public void setcompanyName(String name) {
        this.companyName = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public long getEmpployeesNumber() {
        return empployeesNumber;
    }

    public void setEmpployeesNumber(long empployeesNumber) {
        this.empployeesNumber = empployeesNumber ;
    }
}

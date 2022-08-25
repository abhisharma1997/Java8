package com.learning.java8.streamapi;

import java.util.List;

public class Employee {

    private int id ;
    private String name;
    private String dept;
    private List<String> mobileNum;
    private long sal;

    public long getSal() {
        return sal;
    }

    public void setSal(long sal) {
        this.sal = sal;
    }

    public Employee(int id, String name, String dept, List<String> mobileNum, long sal) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.mobileNum = mobileNum;
        this.sal = sal;
    }

    public Employee(int id, String name, String dept, List<String> mobileNum) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.mobileNum = mobileNum;
    }

    public List<String> getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(List<String> mobileNum) {
        this.mobileNum = mobileNum;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", mobileNum=" + mobileNum +
                ", sal=" + sal +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
}

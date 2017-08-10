package com.project;




import org.springframework.data.annotation.Id;

public class Employee {

@Id
   private  String eid;
    String ename;

    public Employee(String eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid='" + eid + '\'' +
                ", ename='" + ename + '\'' +
                '}';
    }
}

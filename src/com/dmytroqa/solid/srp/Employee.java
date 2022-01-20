package com.dmytroqa.solid.srp;

public class Employee {

    private long id;
    private String name;
    private String department;
    private boolean isWorking;

    public Employee(long id, String name, String department, boolean isWorking) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.isWorking = isWorking;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }
}

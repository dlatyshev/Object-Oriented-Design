package com.dmytroqa.solid.srp;

public class ClientModule {

    public static void main(String[] args) {
        Employee employee = new Employee(12345, "Dima", "AQA", true);
        hireNewEmployee(employee);
        terminateEmployee(employee);
    }

    public static void hireNewEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.saveEmployee(employee);
    }

    public static void terminateEmployee(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAO();
        employeeDAO.deleteEmployee(employee);
    }
}

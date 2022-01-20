package com.dmytroqa.solid.srp;

public class EmployeeDAO {

    public void saveEmployee(Employee employee) {
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getInstance();
        connectionManager.connect();
        connectionManager.getConnection()
                .executeSQL("INSERT INTO Employees (id, name, department, isWorking) VALUES (%s, %s, %s, %s)"
                        .formatted(employee.getId(), employee.getName(), employee.getDepartment(), employee.isWorking()));
        connectionManager.disconnect();
    }

    public void deleteEmployee(Employee employee) {
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getInstance();
        connectionManager.connect();
        connectionManager.getConnection().executeSQL("DELETE FROM Employees WHERE id = '%s'".formatted(employee.getId()));
        connectionManager.disconnect();
    }
}

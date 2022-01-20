package com.dmytroqa.solid.srp;

public class DatabaseConnectionManager {

    private Connection connection;
    private static final DatabaseConnectionManager instance = new DatabaseConnectionManager();

    private DatabaseConnectionManager() {
        this.connection = new Connection();
    }

    public static DatabaseConnectionManager getInstance() {
        return instance;
    }

    public void connect() {
        System.out.println("Connection has been established");
    }

    public void disconnect() {
        System.out.println("Connection has been terminated");
    }

    public Connection getConnection() {
        return connection;
    }
}

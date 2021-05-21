package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBHandler {

    String connectionUrl = "jdbc:mysql://localhost:3306/shop";
    String user = "root";
    String password = "";

    private Connection connection;

    public DBHandler() {
        try {
            connection = DriverManager.getConnection(connectionUrl, user, password);
        } catch (SQLException e) {
            System.out.println("Unable to connect to database");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}


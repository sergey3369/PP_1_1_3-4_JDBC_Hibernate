package jm.task.core.jdbc.util;


import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/db";
    private static final String LOG = "root";
    private static final String PASS = "root";
    private static Connection connection;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.jdbc.Driver");
            return connection = DriverManager.getConnection(URL, LOG, PASS);
    }
}

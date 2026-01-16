package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConfig {

    private static final String URL =
            "jdbc:h2:~/Documents/Kei_Database/game-db;AUTO_SERVER=TRUE";
    private static final String USER = "admin";
    private static final String PASSWORD = "";
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

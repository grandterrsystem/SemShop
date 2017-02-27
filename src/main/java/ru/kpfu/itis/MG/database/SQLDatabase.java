package ru.kpfu.itis.MG.database;

import ru.kpfu.itis.MG.exception.DBException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDatabase {
    private final static String DRIVER = "org.postgresql.Driver";
    private final static String CONNECTION_URI = "jdbc:postgresql://localhost:5432/postgres";
    private final static String LOGIN = "postgres";
    private final static String PASSWORD = "12345";
    private static Connection connection;

    public static Connection getConnection() throws DBException {
        if(connection == null){
            try {
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(CONNECTION_URI, LOGIN, PASSWORD);
            } catch (ClassNotFoundException e) {
                throw new DBException("Can't find Database driver.");
            } catch (SQLException ex) {
                throw new DBException("Can't connect to Database (" + ex.getErrorCode() + ": " + ex.getMessage() + ").");
            }
        }
        return connection;

    }
}

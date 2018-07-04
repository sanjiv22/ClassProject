/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Database.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sanji
 */
public class DbConnection {

    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String DB_USER = "hr";
    private static final String DB_PASSWORD = "hr123";

    public static Connection conn;

    public DbConnection() {

    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        try {
            Class.forName(DB_DRIVER);
            conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return conn;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}

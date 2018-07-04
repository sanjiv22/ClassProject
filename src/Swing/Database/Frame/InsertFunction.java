/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Database.Frame;

import Swing.Database.Connection.DbConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JLabel;

/**
 *
 * @author sanji
 */
public class InsertFunction {

    public void insertRecord() throws ClassNotFoundException, SQLException {

        Connection dbConnection = null;

        CallableStatement callableStatement = null;

        String insertStoreProc = "{call insertDBUSER(?,?,?,?)}";

        try {
            dbConnection = DbConnection.getConnection();
            callableStatement = dbConnection.prepareCall(insertStoreProc);
            callableStatement.setInt(1, 11111);
            callableStatement.setString(2, "pranaya");
            callableStatement.setString(3, "system");
            callableStatement.setDate(4, getCurrentDate());

            // execute insertDBUSER store procedure
            callableStatement.executeUpdate();

            System.out.println("Record is inserted into DBUSER table!");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            if (callableStatement != null) {
                callableStatement.close();
            }

            if (dbConnection != null) {
                dbConnection.close();
            }

        }

    }

    private static java.sql.Date getCurrentDate() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getTime());
    }

}

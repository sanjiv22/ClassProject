/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Swing.Database.Frame;

import Swing.Database.Connection.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author sanji
 */
public class DeleteFunction {

    protected static void deleteRecord() throws SQLException, ClassNotFoundException {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        String deleteSQL = "DELETE DBUSER WHERE USER_ID = ?";

        try {
            dbConnection = DbConnection.getConnection();
            preparedStatement = dbConnection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, 11111);

            // execute delete SQL stetement
            preparedStatement.executeUpdate();

            System.out.println("Record is deleted!");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (dbConnection != null) {
                dbConnection.close();
            }

        }

    }

}

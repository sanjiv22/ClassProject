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
public class UpdateFunction {
    protected static void updateRecord() throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String updateTableSQL = "UPDATE DBUSER SET USERNAME = ? "
				                  + " WHERE USER_ID = ?";

		try {
			dbConnection = DbConnection.getConnection();
			preparedStatement = dbConnection.prepareStatement(updateTableSQL);

			preparedStatement.setString(1, "Bibek");
			preparedStatement.setInt(2, 11111);

			// execute update SQL stetement
			preparedStatement.executeUpdate();

			System.out.println("Record is updated to DBUSER table!");

		} catch (SQLException | ClassNotFoundException e) {

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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.PreparedStatement.UpdateExample;

import java.sql.*;

/**
 *
 * @author sanji
 */
public class JBDCPreparedStatementUpdateExample {
    	private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String DB_USER = "hr";
	private static final String DB_PASSWORD = "hr123";

	public static void main(String[] argv) {

		try {

			updateRecordToTable();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	private static void updateRecordToTable() throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;

		String updateTableSQL = "UPDATE DBUSER1 SET USERNAME = ? "
				                  + " WHERE USER_ID = ?";

		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(updateTableSQL);

			preparedStatement.setString(1, "new_updated_username");
			preparedStatement.setInt(2, 101);

			// execute update SQL stetement
			preparedStatement.executeUpdate();

			System.out.println("Record is updated to DBUSER table!");

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

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(
                            DB_CONNECTION, DB_USER,DB_PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.UpdateExample;

import java.sql.*;

/**
 *
 * @author sanji
 */
public class JDBCStatementUpdateExample {
    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String DB_USER = "hr";
	private static final String DB_PASSWORD = "hr123";

	public static void main(String[] argv) {

		try {

			updateRecordIntoDbUserTable();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	private static void updateRecordIntoDbUserTable() throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;

		String updateTableSQL = "UPDATE DBUSER"
				+ " SET USERNAME = 'Manish' "
				+ " WHERE USER_ID = 3";

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			System.out.println(updateTableSQL);

			// execute update SQL stetement
			statement.executeUpdate(updateTableSQL);

			System.out.println("Record is updated to DBUSER table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
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

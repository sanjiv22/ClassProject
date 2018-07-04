/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.StoredProcedure;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sanji
 */
public class JBDCCallableStatementDeleteUserExample {
 
     private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String DB_USER = "hr";
	private static final String DB_PASSWORD = "hr123";

	public static void main(String[] argv) {

		try {

			callOracleStoredProcINParameter();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	private static void callOracleStoredProcINParameter() throws SQLException {

		Connection dbConnection = null;
		CallableStatement callableStatement = null;

		String insertStoreProc = "{call DELETEDBUSERBYUSERID(?)}";

		try {
			dbConnection = getDBConnection();
			callableStatement = dbConnection.prepareCall(insertStoreProc);

			callableStatement.setInt(1, 1000);
			
			// execute insertDBUSER store procedure
			callableStatement.executeUpdate();

			System.out.println("Record is deleted from DBUSER table!");

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

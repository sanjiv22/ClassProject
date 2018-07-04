/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.StoredProcedure;

import java.sql.*;

/**
 *
 * @author sanji
 */

/*
CREATE OR REPLACE PROCEDURE insertDBUSER(
	   p_userid IN DBUSER.USER_ID%TYPE,
	   p_username IN DBUSER.USERNAME%TYPE,
	   p_createdby IN DBUSER.CREATED_BY%TYPE,
	   p_date IN DBUSER.CREATED_DATE%TYPE)
IS
BEGIN

  INSERT INTO DBUSER ("USER_ID", "USERNAME", "CREATED_BY", "CREATED_DATE") 
  VALUES (p_userid, p_username,p_createdby, p_date);

  COMMIT;

END;
*/
public class JDBCCallableStatementINParameterExample {
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

		String insertStoreProc = "{call insertDBUSER(?,?,?,?)}";

		try {
			dbConnection = getDBConnection();
			callableStatement = dbConnection.prepareCall(insertStoreProc);

			callableStatement.setInt(1, 1000);
			callableStatement.setString(2, "mkyong");
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

	private static java.sql.Date getCurrentDate() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Date(today.getTime());
	}
    
}

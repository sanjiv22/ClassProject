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
CREATE OR REPLACE PROCEDURE getDBUSERByUserId(
	   p_userid IN DBUSER.USER_ID%TYPE,
	   o_username OUT DBUSER.USERNAME%TYPE,
	   o_createdby OUT  DBUSER.CREATED_BY%TYPE,
	   o_date OUT DBUSER.CREATED_DATE%TYPE)
IS
BEGIN

  SELECT USERNAME , CREATED_BY, CREATED_DATE
  INTO o_username, o_createdby,  o_date 
  from  DBUSER WHERE USER_ID = p_userid;

END;
*/
public class JDBCCallableStatementOUTParameterExample {
 
    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String DB_USER = "hr";
	private static final String DB_PASSWORD = "hr123";

	public static void main(String[] argv) {

		try {

			callOracleStoredProcOUTParameter();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

	}

	private static void callOracleStoredProcOUTParameter() throws SQLException {

		Connection dbConnection = null;
		CallableStatement callableStatement = null;

		String getDBUSERByUserIdSql = "{call getDBUSERByUserId(?,?,?,?)}";

		try {
			dbConnection = getDBConnection();
			callableStatement = dbConnection.prepareCall(getDBUSERByUserIdSql);

			callableStatement.setInt(1, 1000);
			callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
			callableStatement.registerOutParameter(3, java.sql.Types.VARCHAR);
			callableStatement.registerOutParameter(4, java.sql.Types.DATE);

			// execute getDBUSERByUserId store procedure
			callableStatement.executeUpdate();

			String userName = callableStatement.getString(2);
			String createdBy = callableStatement.getString(3);
			Date createdDate = callableStatement.getDate(4);

			System.out.println("UserName : " + userName);
			System.out.println("CreatedBy : " + createdBy);
			System.out.println("CreatedDate : " + createdDate);

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

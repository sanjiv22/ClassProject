/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.SelectExample;

import java.sql.*;

/**
 *
 * @author sanji
 */
public class JDBCStatementSelectExamole {
    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String DB_USER = "hr";
	private static final String DB_PASSWORD = "hr123";

	public static void main(String[] args) 
        {
            try { 
                    selectRecordsFromDbUserTable();
                } catch (SQLException e) {
                    System.out.println(e.getMessage());
            }
        }

	private static void selectRecordsFromDbUserTable() throws SQLException {

		Connection dbConnection = null;
		Statement statement = null;

		String selectTableSQL = "SELECT USER_ID, USERNAME, created_by from DBUSER";

		try {
			dbConnection = getDBConnection();
			statement = dbConnection.createStatement();

			System.out.println(selectTableSQL);

			// execute select SQL stetement
			ResultSet rs = statement.executeQuery(selectTableSQL);

			while (rs.next()) {

				String userid = rs.getString("USER_ID");
				String username = rs.getString("USERNAME");
                                String created_by = rs.getString("created_by");

				System.out.println("userid : " + userid);
				System.out.println("username : " + username);
                                System.out.println("created by : " + created_by);

			}
                        
                         while (rs.next())
                            System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));

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
        		dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
			return dbConnection;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return dbConnection;
	}

}

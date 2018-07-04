/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database.DatabaseConnection;

import java.sql.*;

/**
 *
 * @author sanji
 */
public class DatabaseConnectionOracle {
    private static final String DB_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_CONNECTION = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String DB_USER = "hr";
    private static final String DB_PASSWORD = "hr123";
    
    public static Connection getDBConnection(){
    Connection dbConnection = null;
    try{
            Class.forName(DB_DRIVER);
       } catch(ClassNotFoundException e)
       {
           System.out.println(e.getMessage());
       }
    
           try {
               dbConnection = DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASSWORD);
               return dbConnection;
           } catch (SQLException e) {
               System.out.println(e.getMessage());
           }
           return dbConnection;
              
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   /* public static void main(String[] args) throws SQLException ,ClassNotFoundException{
         // Load the JDBC driver
     Class.forName("oracle.jdbc.driver.OracleDriver");
     System.out.println("Driver loaded");

     // Establish a connection with mysql
     Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "hr", "hr123");
     System.out.println("Database connected");

     // Create a statement
     Statement statement = connection.createStatement();

     // Execute a statement
     ResultSet resultSet = statement.executeQuery
       ("SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME,PHONE_NUMBER, HIRE_DATE, JOB_ID FROM employees WHERE First_name LIKE 'S%'");

     // Iterate through the result and print the student names
     while (resultSet.next())
       System.out.println(
               resultSet.getString(1) + "\t\t" +
               resultSet.getString(2) + "\t\t" + 
               resultSet.getString(3) + "\t\t" +
               resultSet.getString(4) + "\t\t" + 
               resultSet.getString(5) + "\t\t" +
               resultSet.getString(6));

     // Close the connection
     connection.close();
   }
     
*/
    }
    


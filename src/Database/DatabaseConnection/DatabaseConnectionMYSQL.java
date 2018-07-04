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
public class DatabaseConnectionMYSQL {
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        //load the jdbc driver
        Class.forName("com.mysql.jbdc.Driver");
        System.out.println("Driver Loaded");
        
        //Establish a connection with MySQL
       Connection connection = DriverManager.getConnection("jbdc:mysql://localhost:3306/javadb","root","");
//        System.out.println("Database Connected");
//        
//        //create a statement
//        Statement statement = connection.createStatement();
//        
//        //Execute a stattemnt
//        ResultSet resultset = statement.executeQuery("select * from emp where age" + "in(10,20)");
//        
//        //Iterate through the result and print the student names
//        while(resultset.next()){
//            System.out.println(resultset.getString(1)+"\t"
//            +resultset.getString(2)+"\t"+resultset.getString(3));
//            
//            //close the connection
//            connection.close();
            
        }
        
        
    }


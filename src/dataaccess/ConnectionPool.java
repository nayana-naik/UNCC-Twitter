/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionPool {
    public static Connection getConnection() throws ClassNotFoundException, SQLException
     {      
         System.out.println("Requesting connection");
        Class.forName("com.mysql.jdbc.Driver");
        
     //  String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName + "?user=" + userName + "&password=" + password;         
       System.out.println(jdbcUrl);
    //   return DriverManager.getConnection(jdbcUrl);
      return DriverManager.getConnection(jdbcUrl + dbName, userName, password);
        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Fahim
 */
public class Main {
    
        public static void main(String[] args) throws Exception{
            
            getConnection();
        }
        
        public static Connection getConnection() throws Exception{
            
            try{
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/database";
                String username = "hey";
                String password = "password";     
                Class.forName(driver);
                
                Connection conn = (Connection) DriverManager.getConnection(url, username, password);
                System.out.println("connected");
                return conn;
            } catch(Exception e){System.out.println(e);}
            
            return null;
        }
}

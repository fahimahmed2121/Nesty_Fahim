/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Fahim
 */
public class login {
    
    public static void main(String[] args) throws Exception{
        Connection conn = null;
            try{
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/log", "root", "Number21");
                if(conn!=null){
                System.out.println("connected to database");
                }
                
            } catch(Exception e){System.out.println("not connected to database");}
            
            
        }
    }
            


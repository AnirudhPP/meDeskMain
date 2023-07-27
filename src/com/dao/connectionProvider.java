/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;
import com.itextpdf.text.log.SysoLogger;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author dell
 */
public class connectionProvider {
    
    public static Connection getCon(){
        try{
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/medesk?useSSL=false","root","9090");
        return con;

        }
        catch(Exception e){
            
            System.out.println(e);
            return null;
        }
    }
    
    
}

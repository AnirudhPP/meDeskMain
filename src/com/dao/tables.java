/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author dell
 */
public class tables {
    public static void main(String[] args) {
        try{
            Connection con= connectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("create table ");
            JOptionPane.showMessageDialog(null, "Table Created Succesfully");
        }
       
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);         
        }
    }
}

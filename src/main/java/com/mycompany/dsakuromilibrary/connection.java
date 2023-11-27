/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsakuromilibrary;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author christinepapillero
 */
public class connection {

    public static Connection connectdb() {

        try {

            String url = "jdbc:mysql://127.0.0.1:3306/kuromilibrary?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String password = "root";

            System.out.println("Connection successful to the database.");
            Connection connection = DriverManager.getConnection(url, user, password);
            
            return connection;
           

        } catch (SQLException throwables) {
            JOptionPane.showMessageDialog(null, throwables);
        } 
        return null;

    }

}

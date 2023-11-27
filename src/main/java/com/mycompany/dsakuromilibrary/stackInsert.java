/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsakuromilibrary;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Stack;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author christinepapillero
 */
public class stackInsert {

    Connection conn = connection.connectdb();
    PreparedStatement pst = null;
    ResultSet result = null;
    public Stack<Object[]> newbookstack = new Stack<>();
    public Stack<Object[]> bookStack = new Stack<>();
    menu m = new menu();
    private DefaultTableModel tablemodel;

    public void updateJTable() {
        // Clear the existing rows in the table
        for (Object[] book : bookStack) {
            tablemodel.addRow(book);
            
        }
    }
    
    
        
    public void addBook(String title, String author, String genre, Date datePublished, Date dateAdded) {
        Object[] book = {title, author, genre, datePublished, dateAdded};
        bookStack.push(book);

        // Insert into the database
        try {
            String query = "INSERT INTO Book(title, author, genre, date_published, date_added) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, title);
            preparedStatement.setString(2, author);
            preparedStatement.setString(3, genre);
            preparedStatement.setDate(4, datePublished);
            preparedStatement.setDate(5, dateAdded);
            preparedStatement.executeUpdate();
            
            conn.close();
        } catch (SQLException throwables) {
            JOptionPane.showMessageDialog(null, throwables);
        } 

    }
    
    public void loadDatabaseContent() {
   
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM Book");

            while (rs.next()) {
                String title = rs.getString("title");
                String author = rs.getString("author");
                String genre = rs.getString("genre");
                Date datePublished = rs.getDate("date_published");
                Date dateAdded = rs.getDate("date_added");

                // Create an array of objects to represent a book entry
                Object[] bookEntry = { title, author, genre, datePublished, dateAdded };

                // Push the book entry array onto the newbookstack
                newbookstack.push(bookEntry);
            }
            
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void deleteMostRecentEntry() {
        if (!newbookstack.isEmpty()) {
            // Remove the most recently added entry from the stack
            Object[] removedBook = newbookstack.pop();

            // Perform deletion from the database using the removed entry's details
            try {
                conn = connection.connectdb();
                String query = "DELETE FROM Book WHERE title = ? AND author = ? AND genre = ? AND date_published = ? AND date_added = ?";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1, (String) removedBook[0]);
                preparedStatement.setString(2, (String) removedBook[1]);
                preparedStatement.setString(3, (String) removedBook[2]);
                preparedStatement.setDate(4, (Date) removedBook[3]);
                preparedStatement.setDate(5, (Date) removedBook[4]);
                preparedStatement.executeUpdate();
                JOptionPane.showMessageDialog(null, "successfully deleted.");
                conn.close();
            } catch (SQLException throwables) {
                JOptionPane.showMessageDialog(null, throwables);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Stack is empty, no entries to delete.");
        }
    }

}

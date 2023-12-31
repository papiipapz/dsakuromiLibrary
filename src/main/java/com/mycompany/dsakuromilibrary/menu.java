/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.dsakuromilibrary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author christinepapillero
 */
public class menu extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet result = null;
    private TableModel tableModel;

    public menu() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        conn = connection.connectdb();
        populate_tab();

    }

    private void closeConnection() {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();

                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelleft = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanelright = new javax.swing.JPanel();
        tab1 = new javax.swing.JPanel();
        boxSortby = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eTab = new javax.swing.JTable();
        addBook = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Browse = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(130, 96, 162));
        jPanel1.setPreferredSize(new java.awt.Dimension(795, 425));

        jPanelleft.setBackground(new java.awt.Color(130, 96, 162));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kuromi__1_photo_sticker_transparent_overlay_by_mcjjang_d7r6qlp-fullview (2).png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Kuromi e-Library System!");

        javax.swing.GroupLayout jPanelleftLayout = new javax.swing.GroupLayout(jPanelleft);
        jPanelleft.setLayout(jPanelleftLayout);
        jPanelleftLayout.setHorizontalGroup(
            jPanelleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelleftLayout.createSequentialGroup()
                .addGroup(jPanelleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelleftLayout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(jPanelleftLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelleftLayout.setVerticalGroup(
            jPanelleftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelleftLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(42, 42, 42))
        );

        jPanelright.setBackground(new java.awt.Color(192, 151, 207));

        tab1.setBackground(new java.awt.Color(192, 151, 207));
        tab1.setRequestFocusEnabled(false);

        boxSortby.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boxSortby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Book ID", "Title", "Author", "Genre", "Date published", "Date Added" }));
        boxSortby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSortbyActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sort by:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot_2023-11-26_at_3.28.32_PM-removebg-preview (1).png"))); // NOI18N
        jLabel8.setText("What book are you looking for?");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        eTab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(eTab);

        javax.swing.GroupLayout tab1Layout = new javax.swing.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                    .addGroup(tab1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boxSortby, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(tab1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tab1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tab1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxSortby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jPanelrightLayout = new javax.swing.GroupLayout(jPanelright);
        jPanelright.setLayout(jPanelrightLayout);
        jPanelrightLayout.setHorizontalGroup(
            jPanelrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelrightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanelrightLayout.setVerticalGroup(
            jPanelrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        addBook.setBackground(new java.awt.Color(130, 96, 162));
        addBook.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addBook.setPreferredSize(new java.awt.Dimension(197, 55));
        addBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBookMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Book");

        javax.swing.GroupLayout addBookLayout = new javax.swing.GroupLayout(addBook);
        addBook.setLayout(addBookLayout);
        addBookLayout.setHorizontalGroup(
            addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(55, 55, 55))
        );
        addBookLayout.setVerticalGroup(
            addBookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addBookLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        Browse.setBackground(new java.awt.Color(130, 96, 162));
        Browse.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Browse");

        javax.swing.GroupLayout BrowseLayout = new javax.swing.GroupLayout(Browse);
        Browse.setLayout(BrowseLayout);
        BrowseLayout.setHorizontalGroup(
            BrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BrowseLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BrowseLayout.setVerticalGroup(
            BrowseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BrowseLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        update.setBackground(new java.awt.Color(130, 96, 162));
        update.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        update.setPreferredSize(new java.awt.Dimension(197, 55));
        update.setRequestFocusEnabled(false);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Update");

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        delete.setBackground(new java.awt.Color(130, 96, 162));
        delete.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        delete.setPreferredSize(new java.awt.Dimension(197, 55));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Delete");

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel7)
                .addContainerGap(68, Short.MAX_VALUE))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ཐི♡ཋྀ ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelleft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Browse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelright, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Browse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelleft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1118, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void populate_tab() {

        try {
            String sql = "SELECT * FROM Book";
            pst = conn.prepareStatement(sql);
            result = pst.executeQuery();
            tableModel = DbUtils.resultSetToTableModel(result);
            eTab.setModel(tableModel);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    private void BrowseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseMouseClicked
        // TODO add your handling code here:

        tab1.setVisible(true);


    }//GEN-LAST:event_BrowseMouseClicked

    private void addBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBookMouseClicked

        addbooks book = new addbooks();
        book.setVisible(true);

        // TODO add your handling code here:

    }//GEN-LAST:event_addBookMouseClicked

   private void sortbookID(){
      try {
                String sql = "SELECT * FROM Book";

                pst = conn.prepareStatement(sql);
                result = pst.executeQuery();
                ArrayList<Object[]> bookid = new ArrayList<>();

                while (result.next()) {
                    Object[] rowData = {
                        result.getObject("book_id"),
                        result.getObject("title"),
                        result.getObject("author"),
                        result.getObject("genre"),
                        result.getObject("date_published"),
                        result.getObject("date_added"),};
                    bookid.add(rowData);
                }

               
                heapsort sort = new heapsort();
                sort.heapSort(bookid);

                DefaultTableModel tableModel = new DefaultTableModel(
            new Object[]{"Book ID", "Title", "Author", "Genre", "Date Published", "Date Added"}, 0
        );
                // Add sorted rows to the table model
                for (Object[] rowData2 : bookid) {
                    tableModel.addRow(rowData2);
                }

                eTab.setModel(tableModel);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
   
   private void sortTitle(){
       //insertion sort implementation
          try {
                String sql = "SELECT * FROM Book";

                pst = conn.prepareStatement(sql);
                result = pst.executeQuery();
                ArrayList<Object[]> bookTitle = new ArrayList<>();

                while (result.next()) {
            Object[] rowData1 = {
                result.getObject("book_id"),
                result.getObject("title"),
                result.getObject("author"),
                result.getObject("genre"),
                result.getObject("date_published"),
                result.getObject("date_added")
            };
            bookTitle.add(rowData1);
        }
               insertionsort sort = new insertionsort();
                sort.insertionSort(bookTitle);

        DefaultTableModel tableModel = new DefaultTableModel(
            new Object[]{"Book ID", "Title", "Author", "Genre", "Date Published", "Date Added"}, 0
        );
                // Add sorted rows to the table model
                for (Object[] rowData2 : bookTitle) {
                    tableModel.addRow(rowData2);
                }

                eTab.setModel(tableModel);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
   
   private void sortAuthor(){
       //selection sort implementation
         try {
                String sql = "SELECT * FROM Book";

                pst = conn.prepareStatement(sql);
                result = pst.executeQuery();
                ArrayList<Object[]> bookAuthor = new ArrayList<>();

                while (result.next()) {
                    Object[] rowData2 = {
                        result.getObject("book_id"),
                        result.getObject("title"),
                        result.getObject("author"),
                        result.getObject("genre"),
                        result.getObject("date_published"),
                        result.getObject("date_added"),};
                    bookAuthor.add(rowData2);
                }

      
                selectionsort sort = new selectionsort();
                sort.selectionSort(bookAuthor);

                 DefaultTableModel tableModel = new DefaultTableModel(
            new Object[]{"Book ID", "Title", "Author", "Genre", "Date Published", "Date Added"}, 0
        );
                // Add sorted rows to the table model
                for (Object[] rowData2 : bookAuthor) {
                    tableModel.addRow(rowData2);
                }

                eTab.setModel(tableModel);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
   
   }
   
   private void sortGenre(){
       //bubble sort implementation
                try {
                String sql = "SELECT * FROM Book";

                pst = conn.prepareStatement(sql);
                result = pst.executeQuery();
                ArrayList<Object[]> bookGenre = new ArrayList<>();

                while (result.next()) {
                    Object[] rowData3 = {
                        result.getObject("book_id"),
                        result.getObject("title"),
                        result.getObject("author"),
                        result.getObject("genre"),
                        result.getObject("date_published"),
                        result.getObject("date_added"),};
                    bookGenre.add(rowData3);
                }

                
                bubblesort sort = new bubblesort();
                sort.bubbleSort(bookGenre);

                 DefaultTableModel tableModel = new DefaultTableModel(
                 new Object[]{"Book ID", "Title", "Author", "Genre", "Date Published", "Date Added"}, 0
                );
                // Add sorted rows to the table model
                for (Object[] rowData2 : bookGenre) {
                    tableModel.addRow(rowData2);
                }

                eTab.setModel(tableModel);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
   
   private void sortDatePublished(){
       //quicksort implementation
   try {
                String sql = "SELECT * FROM Book";

                pst = conn.prepareStatement(sql);
                result = pst.executeQuery();
                ArrayList<Object[]> bookDatepub = new ArrayList<>();

                while (result.next()) {
                    Object[] rowData4 = {
                        result.getObject("book_id"),
                        result.getObject("title"),
                        result.getObject("author"),
                        result.getObject("genre"),
                        result.getObject("date_published"),
                        result.getObject("date_added"),};
                    bookDatepub.add(rowData4);
                }

                 int low = 0;
                 int high = bookDatepub.size() - 1;
                quicksort sort = new quicksort();
                sort.quickSort(bookDatepub,low,high);

                DefaultTableModel tableModel = new DefaultTableModel(
                 new Object[]{"Book ID", "Title", "Author", "Genre", "Date Published", "Date Added"}, 0
                );
                // Add sorted rows to the table model
                for (Object[] rowData2 : bookDatepub) {
                    tableModel.addRow(rowData2);
                }

                eTab.setModel(tableModel);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
   
   
   }
   
   
   private void sortDateAdded(){
       //heapsort implementation
   try {
                String sql = "SELECT * FROM Book";

                pst = conn.prepareStatement(sql);
                result = pst.executeQuery();
                ArrayList<Object[]> bookDateAdded = new ArrayList<>();

                while (result.next()) {
                    Object[] rowData5 = {
                        result.getObject("book_id"),
                        result.getObject("title"),
                        result.getObject("author"),
                        result.getObject("genre"),
                        result.getObject("date_published"),
                        result.getObject("date_added"),};
                    bookDateAdded.add(rowData5);
                }

                 int low = 0;
                 int high = bookDateAdded.size() - 1;
                mergesort sort = new mergesort();
                sort.mergeSort(bookDateAdded,low,high);

                DefaultTableModel tableModel = new DefaultTableModel(
                 new Object[]{"Book ID", "Title", "Author", "Genre", "Date Published", "Date Added"}, 0
                );
                // Add sorted rows to the table model
                for (Object[] rowData2 : bookDateAdded) {
                    tableModel.addRow(rowData2);
                }

                eTab.setModel(tableModel);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
   
   }
   
    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked

        try {
            populate_tab();
            eTab.setModel(tableModel);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_updateMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        stackInsert stack = new stackInsert();
        stack.deleteMostRecentEntry();


    }//GEN-LAST:event_deleteMouseClicked

    private void boxSortbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSortbyActionPerformed

        String selectedColumnName = (String) boxSortby.getSelectedItem();

        switch (selectedColumnName) {
            case "Book ID":
            sortbookID();
            break;
            case "Title":
            sortTitle();
            break;
            case "Author":
            sortAuthor();
            break;
            case "Genre":
            sortGenre();
            break;
            case "Date published":
            sortDatePublished();
            break;
            case "Date Added":
            sortDateAdded();
            break;
            default:

            break;
        }
    }//GEN-LAST:event_boxSortbyActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Browse;
    private javax.swing.JPanel addBook;
    private javax.swing.JComboBox<String> boxSortby;
    private javax.swing.JPanel delete;
    private javax.swing.JTable eTab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelleft;
    private javax.swing.JPanel jPanelright;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tab1;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itenas.oop.org.uashotel.swing;

import com.itenas.oop.org.uashotel.swing.component.ExitConfirmation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class ManageGuestReceptionist extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    
    public ManageGuestReceptionist() {
        initComponents();
        ShowGuest();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLogOut = new javax.swing.JLabel();
        lblLogOut1 = new javax.swing.JLabel();
        lblLogOut2 = new javax.swing.JLabel();
        lblLogOut3 = new javax.swing.JLabel();
        lblLogOut4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtGuestName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtGuestPhoneNumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelGuest = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtGuestId = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtGuestAge = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(173, 151, 79));

        lblLogOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLogOut.setForeground(new java.awt.Color(255, 255, 255));
        lblLogOut.setText("Log Out");
        lblLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
        });

        lblLogOut1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLogOut1.setForeground(new java.awt.Color(255, 255, 255));
        lblLogOut1.setText("Guest");
        lblLogOut1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogOut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOut1MouseClicked(evt);
            }
        });

        lblLogOut2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLogOut2.setForeground(new java.awt.Color(255, 255, 255));
        lblLogOut2.setText("Rooms");
        lblLogOut2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogOut2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOut2MouseClicked(evt);
            }
        });

        lblLogOut3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLogOut3.setForeground(new java.awt.Color(255, 255, 255));
        lblLogOut3.setText("Reservation");
        lblLogOut3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogOut3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOut3MouseClicked(evt);
            }
        });

        lblLogOut4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblLogOut4.setForeground(new java.awt.Color(255, 255, 255));
        lblLogOut4.setText("Dashboard");
        lblLogOut4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogOut4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOut4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogOut)
                    .addComponent(lblLogOut1)
                    .addComponent(lblLogOut2)
                    .addComponent(lblLogOut3)
                    .addComponent(lblLogOut4))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(lblLogOut2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogOut1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogOut3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogOut4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogOut)
                .addGap(96, 96, 96))
        );

        jPanel3.setBackground(new java.awt.Color(190, 160, 90));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        txtGuestName.setBackground(new java.awt.Color(255, 255, 255));
        txtGuestName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 151, 79)));
        txtGuestName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(173, 151, 79));
        jLabel2.setText("ID Guest");

        txtSearch.setBackground(new java.awt.Color(255, 255, 255));
        txtSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 151, 79)));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(173, 151, 79));
        jLabel3.setText("Guest Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(173, 151, 79));
        jLabel4.setText("Guest Phone Number");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(173, 151, 79));
        jLabel5.setText("Guest Age");

        txtGuestPhoneNumber.setBackground(new java.awt.Color(255, 255, 255));
        txtGuestPhoneNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 151, 79)));
        txtGuestPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestPhoneNumberActionPerformed(evt);
            }
        });

        tabelGuest.setBackground(new java.awt.Color(204, 204, 255));
        tabelGuest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Guest", "Guest Name", "Guest Phone Number", "Guest Age"
            }
        ));
        tabelGuest.setGridColor(new java.awt.Color(190, 160, 90));
        tabelGuest.setRowHeight(25);
        tabelGuest.setRowMargin(1);
        jScrollPane1.setViewportView(tabelGuest);

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(3, 45, 137));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Hotel Management System");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(173, 151, 79));
        jLabel10.setText("Manage Guest");

        txtGuestId.setBackground(new java.awt.Color(255, 255, 255));
        txtGuestId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 151, 79)));
        txtGuestId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestIdActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(3, 45, 137));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtGuestAge.setBackground(new java.awt.Color(255, 255, 255));
        txtGuestAge.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 151, 79)));
        txtGuestAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestAgeActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(3, 45, 137));
        btnClear.setText("Edit");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4)
                                                .addComponent(txtGuestId, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtGuestName)
                                        .addComponent(txtGuestAge)
                                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtGuestPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 843, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(525, 525, 525)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(418, 418, 418)
                                .addComponent(jLabel8)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGuestId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGuestPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGuestAge, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        if (txtGuestId.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Guest ID is required for deletion");
} else {
    int guestIdToDelete = Integer.parseInt(txtGuestId.getText());

    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "basdat2020");

        // Query SQL untuk menghapus data
        String deleteSql = "DELETE Guests, account FROM Guests " +
                           "INNER JOIN account ON Guests.ID_acc = account.ID_acc " +
                           "WHERE Guests.id_guest = ?";

        // Membuat prepared statement untuk menghindari SQL injection
        try (PreparedStatement deleteStmt = con.prepareStatement(deleteSql)) {
            // Mengatur parameter prepared statement sesuai dengan data yang akan dihapus
            deleteStmt.setInt(1, guestIdToDelete);

            // Menjalankan pernyataan SQL untuk melakukan delete
            int rowsAffected = deleteStmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Guest Deleted");
                ShowGuest(); // Ganti dengan ShowGuests() sesuai dengan fungsinya
            } else {
                JOptionPane.showMessageDialog(this, "Guest ID not found or failed to delete");
            }
        }

        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace(); // Sebaiknya ditangani dengan lebih baik, minimal mencetak error stack trace
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
}

        
    }//GEN-LAST:event_btnDeleteActionPerformed
    
    private void ShowGuest() {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "basdat2020");
        st = con.createStatement();
        rs = st.executeQuery("SELECT guests.ID_Guest, account.username, guests.guest_pnumber, guests.guest_age FROM guests INNER JOIN account ON guests.ID_acc = account.ID_acc");

        // Mendapatkan metadata dari ResultSet
        java.sql.ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        // Mengosongkan model tabel
        DefaultTableModel model = (DefaultTableModel) tabelGuest.getModel();
        model.setRowCount(0);

        // Menambahkan baris ke model
        while (rs.next()) {
            try {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                model.addRow(rowData);
            } catch (Exception e) {
                e.printStackTrace(); // Cetak error stack trace pada setiap iterasi untuk melacak kesalahan
            }
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Sebaiknya ditangani dengan lebih baik, minimal mencetak error stack trace
    } finally {
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        if (txtGuestId.getText().isEmpty() || txtGuestName.getText().isEmpty() || txtGuestPhoneNumber.getText().isEmpty() || txtGuestAge.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Missing Data");
} else {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "basdat2020");

        // Query SQL untuk mengupdate data dengan JOIN
        String sql = "UPDATE Guests " +
                     "INNER JOIN account ON Guests.ID_acc = account.ID_acc " +
                     "SET account.username = ?, Guests.guest_pnumber = ?, Guests.guest_age = ? " +
                     "WHERE Guests.id_guest = ?";

        // Membuat prepared statement untuk menghindari SQL injection
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            // Mengatur parameter prepared statement sesuai dengan data yang akan diupdate
            pstmt.setString(1, txtGuestName.getText());
            pstmt.setString(2, txtGuestPhoneNumber.getText());
            pstmt.setInt(3, Integer.valueOf(txtGuestAge.getText()));
            pstmt.setInt(4, Integer.valueOf(txtGuestId.getText()));
            
            // Menjalankan pernyataan SQL untuk melakukan update
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "Guest Updated");
                ShowGuest(); // Ganti dengan ShowGuests() sesuai dengan fungsinya
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update guest");
            }
        }

        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace(); // Sebaiknya ditangani dengan lebih baik, minimal mencetak error stack trace
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
}

        
    }//GEN-LAST:event_btnEditActionPerformed

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        new ExitConfirmation().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void lblLogOut1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOut1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogOut1MouseClicked

    private void lblLogOut2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOut2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogOut2MouseClicked

    private void lblLogOut3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOut3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogOut3MouseClicked

    private void lblLogOut4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOut4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogOut4MouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void txtGuestNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestNameActionPerformed

    private void txtGuestIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestIdActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        if (txtSearch.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please enter a search query");
} else {
    String searchQuery = txtSearch.getText();

    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "basdat2020");

        // Query SQL untuk melakukan pencarian berdasarkan ID atau nama
        String searchSql = "SELECT Guests.id_guest, account.username, Guests.guest_pnumber, Guests.guest_age " +
                           "FROM Guests INNER JOIN account ON Guests.ID_acc = account.ID_acc " +
                           "WHERE Guests.id_guest = ? OR account.username LIKE ?";

        // Membuat prepared statement untuk menghindari SQL injection
        try (PreparedStatement searchStmt = con.prepareStatement(searchSql)) {
            // Mengatur parameter prepared statement sesuai dengan data yang akan dicari
            searchStmt.setString(1, searchQuery);
            searchStmt.setString(2, "%" + searchQuery + "%");

            // Menjalankan pernyataan SQL untuk melakukan pencarian
            ResultSet searchResult = searchStmt.executeQuery();

            // Mendapatkan metadata dari ResultSet
            ResultSetMetaData metaData = searchResult.getMetaData();
            int columnCount = metaData.getColumnCount();

            // Mengosongkan model tabel
            DefaultTableModel model = (DefaultTableModel) tabelGuest.getModel();
            model.setRowCount(0);

            // Menambahkan baris ke model berdasarkan hasil pencarian
            while (searchResult.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = searchResult.getObject(i);
                }
                model.addRow(rowData);
            }

            if (model.getRowCount() > 0) {
                JOptionPane.showMessageDialog(this, "Search complete");
            } else {
                JOptionPane.showMessageDialog(this, "No matching records found");
            }
        }

        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace(); // Sebaiknya ditangani dengan lebih baik, minimal mencetak error stack trace
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
}

        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtGuestAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestAgeActionPerformed

    private void txtGuestPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestPhoneNumberActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtGuestId.setText(" ");
        txtGuestName.setText(" ");
        txtGuestPhoneNumber.setText(" ");
        txtGuestAge.setText(" ");
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(ManageGuestReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageGuestReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageGuestReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageGuestReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageGuestReceptionist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblLogOut1;
    private javax.swing.JLabel lblLogOut2;
    private javax.swing.JLabel lblLogOut3;
    private javax.swing.JLabel lblLogOut4;
    private javax.swing.JTable tabelGuest;
    private javax.swing.JTextField txtGuestAge;
    private javax.swing.JTextField txtGuestId;
    private javax.swing.JTextField txtGuestName;
    private javax.swing.JTextField txtGuestPhoneNumber;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

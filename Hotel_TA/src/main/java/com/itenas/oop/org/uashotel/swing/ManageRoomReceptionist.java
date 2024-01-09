/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itenas.oop.org.uashotel.swing;

import com.itenas.oop.org.uashotel.swing.component.ExitConfirmation;
import com.itenas.oop.org.uashotel.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author acer
 */
public class ManageRoomReceptionist extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    
    public ManageRoomReceptionist() {
        initComponents();
        txtIdRoom.setBackground(new java.awt.Color(0,0,0,1));
        txtBadTotal.setBackground(new java.awt.Color(0,0,0,1));
        txtRoomPrice.setBackground(new java.awt.Color(0,0,0,1));
        cmbStatus.setBackground(new java.awt.Color(0,0,0,1));
        ShowRooms();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblGuest = new javax.swing.JLabel();
        lblLogOut2 = new javax.swing.JLabel();
        lblReservation = new javax.swing.JLabel();
        lblLogOut = new javax.swing.JLabel();
        lblDashboard1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtRoomPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtBadTotal = new javax.swing.JTextField();
        cmbStatus = new javax.swing.JComboBox<>();
        cmbRoomType = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelRoom = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIdRoom = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(173, 151, 79));

        lblGuest.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblGuest.setForeground(new java.awt.Color(255, 255, 255));
        lblGuest.setText("Guest");
        lblGuest.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuestMouseClicked(evt);
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

        lblReservation.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblReservation.setForeground(new java.awt.Color(255, 255, 255));
        lblReservation.setText("Reservation");
        lblReservation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReservationMouseClicked(evt);
            }
        });

        lblLogOut.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblLogOut.setForeground(new java.awt.Color(255, 255, 255));
        lblLogOut.setText("Log Out");
        lblLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
        });

        lblDashboard1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDashboard1.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard1.setText("Dashboard");
        lblDashboard1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDashboard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboard1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGuest)
                    .addComponent(lblLogOut2)
                    .addComponent(lblReservation)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblLogOut)
                        .addComponent(lblDashboard1)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(lblLogOut2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblGuest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblReservation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDashboard1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                .addComponent(lblLogOut)
                .addGap(92, 92, 92))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 730));

        jPanel3.setBackground(new java.awt.Color(190, 160, 90));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 0, 1216, -1));

        txtRoomPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtRoomPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 151, 79)));
        txtRoomPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRoomPriceActionPerformed(evt);
            }
        });
        jPanel1.add(txtRoomPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 300, 32));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(173, 151, 79));
        jLabel2.setText("ID Room");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        lblSearch.setBackground(new java.awt.Color(255, 255, 255));
        lblSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 151, 79)));
        lblSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblSearchActionPerformed(evt);
            }
        });
        jPanel1.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(998, 79, 244, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(173, 151, 79));
        jLabel3.setText("Room Type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(173, 151, 79));
        jLabel4.setText("Bed Total");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(173, 151, 79));
        jLabel5.setText("Status");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, -1, -1));

        txtBadTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtBadTotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 151, 79)));
        txtBadTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBadTotalActionPerformed(evt);
            }
        });
        jPanel1.add(txtBadTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 300, 32));

        cmbStatus.setBackground(new java.awt.Color(173, 151, 79));
        cmbStatus.setForeground(new java.awt.Color(255, 255, 255));
        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Booked", " " }));
        jPanel1.add(cmbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 300, 34));

        cmbRoomType.setBackground(new java.awt.Color(173, 151, 79));
        cmbRoomType.setForeground(new java.awt.Color(255, 255, 255));
        cmbRoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VIP", "Double Bed", "Single Bad", "Family" }));
        cmbRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoomTypeActionPerformed(evt);
            }
        });
        jPanel1.add(cmbRoomType, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 300, 34));

        tabelRoom.setBackground(new java.awt.Color(204, 204, 255));
        tabelRoom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Room", "Room Type", "Room Price", "Bed Total", "Status"
            }
        ));
        tabelRoom.setGridColor(new java.awt.Color(190, 160, 90));
        tabelRoom.setRowHeight(25);
        tabelRoom.setRowMargin(1);
        jScrollPane1.setViewportView(tabelRoom);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(521, 119, 843, 530));

        btnAdd.setBackground(new java.awt.Color(0, 204, 0));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 300, 35));

        btnClear.setBackground(new java.awt.Color(3, 45, 137));
        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, 300, 35));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(173, 151, 79));
        jLabel8.setText("Hotel Management System");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(173, 151, 79));
        jLabel9.setText("Room Price");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(173, 151, 79));
        jLabel10.setText("Manage Room");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 47, -1, -1));

        txtIdRoom.setBackground(new java.awt.Color(255, 255, 255));
        txtIdRoom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 151, 79)));
        txtIdRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdRoomActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 300, 30));

        btnSearch.setBackground(new java.awt.Color(3, 45, 137));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 78, 104, 35));

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 570, 300, 35));

        btnEdit.setBackground(new java.awt.Color(3, 45, 137));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 300, 35));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBadTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBadTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBadTotalActionPerformed
    
    private void ShowRooms() {
    try
    {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "basdat2020");
        st = con.createStatement();
        rs = st.executeQuery("select * from hotel_room");

        // Mendapatkan metadata dari ResultSet
        java.sql.ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        // Mengosongkan model tabel
        DefaultTableModel model = (DefaultTableModel) tabelRoom.getModel();
        model.setRowCount(0);

        // Menambahkan baris ke model
        while (rs.next())
        {
            Object[] rowData = new Object[columnCount];
            for (int i = 1; i <= columnCount; i++)
            {
                rowData[i - 1] = rs.getObject(i);
            }
            model.addRow(rowData);
        }
    } catch (Exception e) {
        e.printStackTrace(); // Sebaiknya ditangani dengan lebih baik, minimal mencetak error stack trace
    } finally{
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
            if (con != null) con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtIdRoom.getText().isEmpty() || cmbRoomType.getSelectedIndex() == -1 || txtRoomPrice.getText().isEmpty() || txtBadTotal.getText().isEmpty() || cmbStatus.getSelectedIndex() == -1) {
    JOptionPane.showMessageDialog(this, "Missing Data");
    } else {
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "basdat2020");
        PreparedStatement Save = con.prepareStatement("INSERT INTO hotel_room VALUES(?, ?, ?, ?, ?)");
        Save.setString(1, txtIdRoom.getText());
        Save.setString(2, cmbRoomType.getSelectedItem().toString());
        Save.setInt(3, Integer.valueOf(txtRoomPrice.getText()));
        Save.setInt(4, Integer.valueOf(txtBadTotal.getText()));
        Save.setString(5, cmbStatus.getSelectedItem().toString());

        int row = Save.executeUpdate();
        if (row > 0) {
            JOptionPane.showMessageDialog(this, "Room Added");
            ShowRooms();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to add room");
        }

        con.close();
    } catch (SQLException ex) {
        ex.printStackTrace(); // Sebaiknya ditangani dengan lebih baik, minimal mencetak error stack trace
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
    }
}

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtIdRoom.setText("");
        cmbRoomType.setSelectedIndex(-1);
        txtRoomPrice.setText("");
        txtBadTotal.setText("");
        cmbStatus.setSelectedIndex(-1);
    }//GEN-LAST:event_btnClearActionPerformed

    private void lblGuestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuestMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGuestMouseClicked

    private void lblLogOut2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOut2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblLogOut2MouseClicked

    private void lblReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReservationMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReservationMouseClicked

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        new ExitConfirmation().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void lblSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblSearchActionPerformed

    private void txtRoomPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRoomPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRoomPriceActionPerformed

    private void txtIdRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdRoomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdRoomActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (lblSearch.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter Room ID to search");
    } else {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "basdat2020");

            // Query SQL untuk mencari data
            String sql = "SELECT * FROM hotel_room WHERE id_room = ?";

            // Membuat prepared statement untuk menghindari SQL injection
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                // Mengatur parameter prepared statement sesuai dengan data yang akan dicari
                pstmt.setString(1, lblSearch.getText());

                // Menjalankan pernyataan SQL untuk melakukan pencarian
                ResultSet rs = pstmt.executeQuery();

                // Menggunakan DefaultTableModel untuk menampung data tabel
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("ID Room");
                model.addColumn("Room Type");
                model.addColumn("Room Price");
                model.addColumn("Bed Total");
                model.addColumn("Status");

                // Mengisi model dengan hasil pencarian
                while (rs.next()) {
                    model.addRow(new Object[]{
                            rs.getString("id_room"),
                            rs.getString("room_type"),
                            rs.getInt("room_price"),
                            rs.getInt("bed_total"),
                            rs.getString("status")
                    });
                }

                // Menampilkan model dalam tabel
                tabelRoom.setModel(model);
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace(); // Sebaiknya ditangani dengan lebih baik, minimal mencetak error stack trace
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtIdRoom.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter Room ID to delete");
    } else {
        int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this room?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (confirmation == JOptionPane.YES_OPTION) {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "basdat2020");

                // Query SQL untuk menghapus data
                String sql = "DELETE FROM hotel_room WHERE id_room = ?";

                // Membuat prepared statement untuk menghindari SQL injection
                try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                    // Mengatur parameter prepared statement sesuai dengan data yang akan dihapus
                    pstmt.setString(1, txtIdRoom.getText());

                    // Menjalankan pernyataan SQL untuk melakukan penghapusan
                    int rowsAffected = pstmt.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Room Deleted");
                        ShowRooms();
                    } else {
                        JOptionPane.showMessageDialog(this, "Room not found or failed to delete");
                    }
                }

                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace(); // Sebaiknya ditangani dengan lebih baik, minimal mencetak error stack trace
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        }
    }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
         if (txtIdRoom.getText().isEmpty() || cmbRoomType.getSelectedIndex() == -1 || txtRoomPrice.getText().isEmpty() || txtBadTotal.getText().isEmpty() || cmbStatus.getSelectedIndex() == -1) {
        JOptionPane.showMessageDialog(this, "Missing Data");
    } else {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "basdat2020");

            // Query SQL untuk mengupdate data
            String sql = "UPDATE hotel_room SET room_type = ?, room_price = ?, bed_total = ?, status = ? WHERE id_room = ?";

            // Membuat prepared statement untuk menghindari SQL injection
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                // Mengatur parameter prepared statement sesuai dengan data yang akan diupdate
                pstmt.setString(1, cmbRoomType.getSelectedItem().toString());
                pstmt.setInt(2, Integer.valueOf(txtRoomPrice.getText()));
                pstmt.setInt(3, Integer.valueOf(txtBadTotal.getText()));
                pstmt.setString(4, cmbStatus.getSelectedItem().toString());
                pstmt.setString(5, txtIdRoom.getText());

                // Menjalankan pernyataan SQL untuk melakukan update
                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Room Updated");
                    ShowRooms();
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update room");
                }
            }

            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace(); // Sebaiknya ditangani dengan lebih baik, minimal mencetak error stack trace
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
    }//GEN-LAST:event_btnEditActionPerformed

    private void cmbRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoomTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRoomTypeActionPerformed

    private void lblDashboard1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboard1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDashboard1MouseClicked

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
            java.util.logging.Logger.getLogger(ManageRoomReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoomReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoomReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoomReceptionist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoomReceptionist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbRoomType;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDashboard1;
    private javax.swing.JLabel lblGuest;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblLogOut2;
    private javax.swing.JLabel lblReservation;
    private javax.swing.JTextField lblSearch;
    private javax.swing.JTable tabelRoom;
    private javax.swing.JTextField txtBadTotal;
    private javax.swing.JTextField txtIdRoom;
    private javax.swing.JTextField txtRoomPrice;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itenas.oop.org.uashotel.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apple
 */
public class Reservation extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Statement st = null;
    
    public Reservation() {
        initComponents();
        
        cbRoomType.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getCost();
            }
        });
        
        txtDurasi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotalPayment();
            }
        });
        ShowRooms();
        
    }

    private void getCost() {
         
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "basdat2020");
            String selectedRoom = (String) cbRoomType.getSelectedItem();
            String query = "SELECT room_price FROM hotel_room WHERE room_type = ?";
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, selectedRoom);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int roomPrice = resultSet.getInt("room_price");
                txtCost.setText(String.valueOf(roomPrice));
            } else {
                // Handle the case when room type is not found in the database
                txtCost.setText("0");
            }

            preparedStatement.close();
            resultSet.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void calculateTotalPayment() {
        
           try {
                int roomPrice = Integer.parseInt(txtCost.getText());
                int duration = Integer.parseInt( txtDurasi.getText());
                int totalPayment = roomPrice * duration;
                txtTotalPayment.setText(String.valueOf(totalPayment));
                
            } catch (NumberFormatException e) {
                // Handle the case when room price is not a valid number
                txtTotalPayment.setText("0");
            }  
    }
      
     private void ShowRooms() {
    try
    {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "basdat2020");
        st = con.createStatement();
        rs = st.executeQuery("SELECT * from reservation");

        // Mendapatkan metadata dari ResultSet
        java.sql.ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        // Mengosongkan model tabel
        DefaultTableModel model = (DefaultTableModel) TabelGuest.getModel();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbRoomType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbGuestTotal = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        TglBooking = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCost = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTotalPayment = new javax.swing.JTextField();
        button1 = new com.itenas.oop.org.uashotel.swing.component.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelGuest = new javax.swing.JTable();
        txtDurasi = new javax.swing.JTextField();
        txtDays = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtGuestID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1398, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(173, 151, 79));
        jPanel2.setPreferredSize(new java.awt.Dimension(190, 365));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 190, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(190, 160, 90));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1210, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(173, 151, 79));
        jLabel2.setText("Room");

        cbRoomType.setBackground(new java.awt.Color(173, 151, 79));
        cbRoomType.setForeground(new java.awt.Color(255, 255, 255));
        cbRoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Single Bed", "Double Bed", "Family Bed", "VIP Bed" }));
        cbRoomType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbRoomTypeItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(173, 151, 79));
        jLabel3.setText("Guest");

        cbGuestTotal.setBackground(new java.awt.Color(173, 151, 79));
        cbGuestTotal.setEditable(true);
        cbGuestTotal.setForeground(new java.awt.Color(255, 255, 255));
        cbGuestTotal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "1", "2", "3", "4", "5", "6", "7" }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(173, 151, 79));
        jLabel4.setText("Booking Date");

        TglBooking.setBackground(new java.awt.Color(173, 151, 79));
        TglBooking.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(173, 151, 79));
        jLabel5.setText("Duration");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(173, 151, 79));
        jLabel6.setText("Cost");

        txtCost.setBackground(new java.awt.Color(255, 255, 255));
        txtCost.setForeground(new java.awt.Color(51, 51, 51));
        txtCost.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 151, 79)));
        txtCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(173, 151, 79));
        jLabel7.setText("Total Payment");

        txtTotalPayment.setBackground(new java.awt.Color(255, 255, 255));
        txtTotalPayment.setForeground(new java.awt.Color(51, 51, 51));
        txtTotalPayment.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 151, 79)));
        txtTotalPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPaymentActionPerformed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(173, 151, 79));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Confirm");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        TabelGuest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Reservation", "Room Type", "Total Guest", "Check In", "Duration", "Cost", "Payment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelGuest);

        txtDurasi.setBackground(new java.awt.Color(255, 255, 255));
        txtDurasi.setForeground(new java.awt.Color(51, 51, 51));
        txtDurasi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 151, 79)));
        txtDurasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurasiActionPerformed(evt);
            }
        });

        txtDays.setBackground(new java.awt.Color(255, 255, 255));
        txtDays.setForeground(new java.awt.Color(51, 51, 51));
        txtDays.setText("      Days");
        txtDays.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(173, 151, 79)));
        txtDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDaysActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Serenity Haven Resorts");

        jLabel8.setFont(new java.awt.Font("Poppins", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Room's Booking");

        txtGuestID.setBackground(new java.awt.Color(255, 255, 255));
        txtGuestID.setForeground(new java.awt.Color(51, 51, 51));
        txtGuestID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(173, 151, 79)));
        txtGuestID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGuestIDActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(173, 151, 79));
        jLabel9.setText("Guest Name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel2)
                                .addComponent(cbRoomType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addComponent(cbGuestTotal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(TglBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCost)
                                .addComponent(txtTotalPayment)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDays, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(215, 215, 215))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(473, 473, 473))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(416, 416, 416))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGuestID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbGuestTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TglBooking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDurasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 139, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostActionPerformed
        getCost();
    }//GEN-LAST:event_txtCostActionPerformed

    private void cbRoomTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbRoomTypeItemStateChanged
        getCost();
    }//GEN-LAST:event_cbRoomTypeItemStateChanged

    private void txtTotalPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPaymentActionPerformed
        calculateTotalPayment();
    }//GEN-LAST:event_txtTotalPaymentActionPerformed

    private void txtDurasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDurasiActionPerformed

    private void txtDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDaysActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDaysActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        {
            try {
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel", "root", "basdat2020");
                PreparedStatement Save = con.prepareStatement("INSERT INTO reservation VALUES(?, ?, ?, ?, ?, ?, ?)");
                java.util.Date utilDate = TglBooking.getDate();
                java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

                
                Save.setInt(1, Integer.parseInt(txtGuestID.getText()));
                Save.setString(2, cbRoomType.getSelectedItem().toString());
                Save.setString(3, cbGuestTotal.getSelectedItem().toString());
                Save.setDate(4, sqlDate);
                Save.setInt(5, Integer.parseInt(txtDurasi.getText()));
                Save.setInt(6, Integer.parseInt(txtCost.getText()));
                Save.setInt(7, Integer.parseInt(txtTotalPayment.getText()));

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
    }//GEN-LAST:event_button1ActionPerformed

    private void txtGuestIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGuestIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGuestIDActionPerformed

    
    
    
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
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelGuest;
    private com.toedter.calendar.JDateChooser TglBooking;
    private com.itenas.oop.org.uashotel.swing.component.Button button1;
    private javax.swing.JComboBox<String> cbGuestTotal;
    private javax.swing.JComboBox<String> cbRoomType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtDays;
    private javax.swing.JTextField txtDurasi;
    private javax.swing.JTextField txtGuestID;
    private javax.swing.JTextField txtTotalPayment;
    // End of variables declaration//GEN-END:variables
}

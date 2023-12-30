/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.itenas.oop.org.uashotel.swing.component;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author apple
 */
public class PanelLoginDanRegister extends javax.swing.JLayeredPane {

    public PanelLoginDanRegister(ActionListener eventRegister) {
        initComponents();
        initRegister(eventRegister);
        initLogin();
        login.setVisible(true);
        register.setVisible(false);
    }
    
    private void initRegister(ActionListener eventRegister) {
        register.setLayout(new MigLayout ("wrap", "push[center]push", "110[]25[]10[]10[]30[]push"));
        JLabel label = new JLabel("Buat Akun");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(48, 45, 35));
        register.add(label);
        
        // Kolom Nama - Password
        MyTextField txtUser = new MyTextField();
        txtUser.setPrefixIcon(new ImageIcon(getClass().getResource("/images/user.png")));
        txtUser.setHint("Nama");
        register.add(txtUser, "w 60%");
        MyTextField txtEmail = new MyTextField();
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/images/mail.png")));
        txtEmail.setHint(("Email"));
        register.add(txtEmail, "w 60%");
        MyPassField txtPass = new MyPassField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/images/pass.png")));
        txtPass.setHint(("Sandi"));
        register.add(txtPass, "w 60%");
        
        // kolom button
        Button cmd = new Button();
        cmd.setBackground(new Color (48, 45, 35));
        cmd.setForeground(new Color (250, 250, 250));
        cmd.addActionListener(eventRegister);
        cmd.setText("Daftar");
        register.add(cmd, "w 40%, h 40");
        
        ShowPasswordCheckBox registerPassShow = new ShowPasswordCheckBox();
        register.add(registerPassShow, "pos 405 277 n n");
        showPassword(registerPassShow, txtPass);
        
    } 
   
    private void initLogin() {
        login.setLayout(new MigLayout("wrap ", "push[center]push", "push[]25[]10[]10[]15[]push"));
        JLabel label = new JLabel("Masuk");
        label.setFont(new Font("sansserif", 1, 30));
        label.setForeground(new Color(48, 45, 35));
        login.add(label);
        
        // Kolom Email - Sandi
        MyTextField txtEmail = new MyTextField();
        txtEmail.setPrefixIcon(new ImageIcon(getClass().getResource("/images/mail.png")));
        txtEmail.setHint(("Email"));
        login.add(txtEmail, "w 60%");
        
        MyPassField txtPass = new MyPassField();
        txtPass.setPrefixIcon(new ImageIcon(getClass().getResource("/images/pass.png")));
        txtPass.setHint(("Sandi"));
        login.add(txtPass, "w 60%");
        
        JButton cmdLupa = new JButton("Lupa Kata Sandi?");
        cmdLupa.setForeground(new Color(100,100,100));
        cmdLupa.setFont(new Font("sansserif", 1, 12));
        cmdLupa.setContentAreaFilled(false);
        cmdLupa.setCursor(new Cursor(Cursor.HAND_CURSOR));
        login.add(cmdLupa);

        // Tombol Sign In
        Button cmd = new Button();
        cmd.setBackground(new Color (48, 45, 35));
        cmd.setForeground(new Color (250, 250, 250));
        cmd.setText("Login");
        login.add(cmd, "w 40%, h 40");
        
        cmd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                login(txtEmail, txtPass);
            }
        });
        
        ShowPasswordCheckBox loginPassShow = new ShowPasswordCheckBox();
        login.add(loginPassShow, "pos 405 255 n n");
        showPassword(loginPassShow, txtPass);
    }
    
    public void login(JTextField txtEmail, JPasswordField txtPass){
        String email = txtEmail.getText();
        String pass = String.valueOf(txtPass.getPassword());
        System.out.println(email);
        System.out.println(pass);
    }
    
    public void showPassword(JCheckBox show, JPasswordField pass){
        show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (show.isSelected()) {
                    pass.setEchoChar((char)0);
                } else {
                    pass.setEchoChar('*');
                }
            }
        });
    }
        
        public void showRegister (boolean show) {
            if (show) {
                register.setVisible(false);
                login.setVisible(true);
            } else {
                register.setVisible(true);
                login.setVisible(false);
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

        login = new javax.swing.JPanel();
        register = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        add(login, "card3");

        register.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout registerLayout = new javax.swing.GroupLayout(register);
        register.setLayout(registerLayout);
        registerLayout.setHorizontalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
        );
        registerLayout.setVerticalGroup(
            registerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        add(register, "card2");
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel login;
    private javax.swing.JPanel register;
    // End of variables declaration//GEN-END:variables
}

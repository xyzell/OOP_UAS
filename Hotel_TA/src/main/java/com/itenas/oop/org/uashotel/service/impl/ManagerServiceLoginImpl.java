/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.org.uashotel.service.impl;

import com.itenas.oop.org.uashotel.pojo.Account;
import com.itenas.oop.org.uashotel.pojo.Management;

import com.itenas.oop.org.uashotel.service.ManagerAccountService;
import com.itenas.oop.org.uashotel.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicholas
 */
public class ManagerServiceLoginImpl implements ManagerAccountService{

    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;
    
    @Override
    public Management login(String username, String password) {
        Management management = null;
        Account account = null;
        String sql = "SELECT ad.ID_Rect, ad.rect_name, ad.rect_pnumber, "
                + "ak.ID_acc, ak.email, ak.username, ak.level "
                + "FROM management ad, account ak "
                + "WHERE ad.ID_acc = ak.ID_acc "
                + "AND ak.username = '"+username+"' "
                + "AND ak.password = '"+password+"'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                management = new Management();
                management.setId(rs.getInt("ID_Management"));
                management.setNama(rs.getString("mgmt_name"));  
                management.setPhoneNumber(rs.getString("mgmt_phoneNumber"));
                account = new Account();
                account.setIdAccount(rs.getInt("ID_acc"));
                account.setEmail(rs.getString("email"));
                account.setUsername(rs.getString("username"));
                account.setLevel(rs.getString("level"));
                management.setAkun(account);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistServiceLoginImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return management;
    }

    @Override
    public Integer register(String username, String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

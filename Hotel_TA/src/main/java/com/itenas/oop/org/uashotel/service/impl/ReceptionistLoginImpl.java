/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.org.uashotel.service.impl;

import com.itenas.oop.org.uashotel.pojo.Account;
import com.itenas.oop.org.uashotel.pojo.Receptionist;
import com.itenas.oop.org.uashotel.service.ReceptionistService;
import com.itenas.oop.org.uashotel.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author acer
 */
public class ReceptionistLoginImpl implements ReceptionistService{
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;
    
    
    @Override
    public Receptionist login(String username, String password) {
    Receptionist receptionist = null;
        Account account = null;
        String sql = "SELECT ad.ID_Rect, ad.rect_name, ad.rect_pnumber, "
                + "ak.ID_acc, ak.email, ak.username, ak.level "
                + "FROM receptionist ad, account ak "
                + "WHERE ad.ID_acc = ak.ID_acc "
                + "AND ak.username = '"+username+"' "
                + "AND ak.password = '"+password+"'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                receptionist = new Receptionist();
                receptionist.setIdReceptionist("ID_Rect");
                receptionist.setNamaReceptionist("rect_name");
                receptionist.setNumberReceptionist("rect_pnumber");
                account = new Account();
                account.setIdAccount("ID_acc");
                account.setEmail(rs.getString("email"));
                account.setUsername(rs.getString("username"));
                account.setLevel(rs.getString("level"));
                receptionist.setAccount(account);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistLoginImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return receptionist;
    }
    
}

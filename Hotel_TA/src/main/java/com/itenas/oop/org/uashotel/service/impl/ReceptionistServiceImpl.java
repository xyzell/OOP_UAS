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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nicholas
 */
public class ReceptionistServiceImpl implements ReceptionistService{
    
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;
    
    @Override
    public List<Receptionist> findAll() {
        List<Receptionist> listReceptionist = new ArrayList<>();
        String sql = "SELECT * FROM receptionist join account on receptionist.id_acc = account.id_acc";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {                
                Receptionist recep = new Receptionist();
                Account account = new Account();
                recep.setIdReceptionist(rs.getString("id_Rect"));
                recep.setNamaReceptionist(rs.getString("rect_name"));
                recep.setNumberReceptionist(rs.getString("rect_pnumber"));
                account.setUsername(rs.getString("username"));
                account.setEmail(rs.getString("email"));
                recep.setAccount(account);
                
                listReceptionist.add(recep);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return listReceptionist;
    }

    @Override
    public Integer create(Receptionist object) {
        int result = 0;
        int maxId = 0;
        String sqlselect = "SELECT * from account";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlselect);
            while (rs.next()) {
                maxId = (rs.getInt("id_acc"));
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            System.out.println("error");
            result = 1;
        }
        
        System.out.println(maxId);
        String sqlRecep = "INSERT INTO receptionist (ID_rect, rect_name, rect_pnumber, ID_acc)"
                + "VALUES ('" + object.getIdReceptionist() + "', "
                + "'" + object.getNamaReceptionist() + "', "
                + "'"+ object.getNumberReceptionist() +"', "
                + "'"+ maxId +"')";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sqlRecep);
            conMan.disconnect();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ID sudah digunakan", "ERROR", JOptionPane.ERROR_MESSAGE);
            result = 1;
        }
        
        return result;
    }

    @Override
    public Integer update(Receptionist object) {
        int result = 0;
        int tester = 0;
        
        String sqlAcc = "SELECT * from account JOIN receptionist WHERE account.ID_acc = receptionist.ID_acc AND account.password = '" + object.getAccount().getPassword() + "' AND receptionist.ID_rect = '" + object.getIdReceptionist() +"'" ;
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlAcc);
            
            while (rs.next()) {
                tester = 1;
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistServiceImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        
        if(tester != 1){
            return result = 1;
        }
        
        String sql = "UPDATE receptionist SET rect_name = '"+object.getNamaReceptionist()+"', "
                + "rect_pnumber = '"+object.getNumberReceptionist()+"' "
                + "WHERE ID_Rect = '"+object.getIdReceptionist()+"'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistServiceImpl.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
        
        return result;
    }

    @Override
    public Receptionist findById(String id) {
        Receptionist receptionist = null;
        String sql = "SELECT * FROM receptionist join account on receptionist.id_acc = account.id_acc WHERE receptionist.ID_rect = '" + id + "'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {                
                receptionist = new Receptionist();
                Account account = new Account();
                receptionist.setIdReceptionist(rs.getString("id_Rect"));
                receptionist.setNamaReceptionist(rs.getString("rect_name"));
                receptionist.setNumberReceptionist(rs.getString("rect_pnumber"));
                account.setUsername(rs.getString("username"));
                account.setEmail(rs.getString("email"));
                receptionist.setAccount(account);
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        
        return receptionist;
    }

    @Override
    public Integer delete(String id) {
        int result = 0;
        String sql = "DELETE a, r FROM account a inner join receptionist r WHERE r.ID_acc = a.ID_acc AND r.ID_Rect = '" + id + "'";
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            result = stmt.executeUpdate(sql);
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistServiceImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return result;
    }

    
}

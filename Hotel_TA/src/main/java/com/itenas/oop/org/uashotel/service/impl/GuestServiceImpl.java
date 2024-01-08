/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.org.uashotel.service.impl;

import com.itenas.oop.org.uashotel.pojo.Account;
import com.itenas.oop.org.uashotel.pojo.Guest;
import com.itenas.oop.org.uashotel.service.GuestService;
import com.itenas.oop.org.uashotel.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author User
 */
public class GuestServiceImpl implements GuestService{
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;
    
    @Override
    public List<Guest> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer create(Guest object) {
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
        }
        
        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        String sqlinsert = "INSERT INTO guests (guest_pnumber, guest_age, ID_acc) "
                + "VALUES ('"+object.getGuest_pnumber()+"', "
                + "'"+object.getGuest_age()+"', "
                + ""+maxId+")";
        
        System.out.println(object.getGuest_pnumber());
        System.out.println(object.getGuest_age());
        System.out.println(maxId);
        
        
        try {
            stmt = conn.createStatement();
            stmt.executeUpdate(sqlinsert);
            conMan.disconnect();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return result;
    }

    @Override
    public Integer update(Guest object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Guest findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer delete(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    
}

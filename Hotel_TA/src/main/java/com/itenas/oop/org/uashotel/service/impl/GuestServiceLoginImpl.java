package com.itenas.oop.org.uashotel.service.impl;

import com.itenas.oop.org.uashotel.pojo.Account;
import com.itenas.oop.org.uashotel.pojo.Guest;
import com.itenas.oop.org.uashotel.service.AkunService;
import com.itenas.oop.org.uashotel.utilities.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class GuestServiceLoginImpl implements AkunService {
    private ConnectionManager conMan;
    private Connection conn;
    Statement stmt;
    ResultSet rs;
    

    @Override
    public Guest login(String username, String password) {
        Guest guest = null;
        Account account = null;
            String sql = "SELECT gs.ID_Guest, gs.guest_name, gs.guest_gender, gs.guest_pnumber, gs.guest_age "
                    + "ak.ID_acc, ak.email, ak.username, ak.level "
                    + "FROM guests gs, account ak "
                    + "WHERE ad.ID_acc = ak.ID_acc "
                    + "AND ak.username = '"+username+"' "
                    + "AND ak.password = '"+password+"'";

        conMan = new ConnectionManager();
        conn = conMan.connect();
        
        try {
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                guest = new Guest();
                guest.setID_Guest("ID_Guest");
                guest.setGuest_name("guest_name");
                guest.setGuest_gender("guest_gender");
                guest.setGuest_pnumber("guest_pnumber");
                guest.setGuest_age(rs.getInt("guest_age"));
                account = new Account();
                account.setIdAccount("ID_acc");
                account.setEmail(rs.getString("email"));
                account.setUsername(rs.getString("username"));
                account.setLevel(rs.getString("level"));
            
            }
            conMan.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(ReceptionistServiceLoginImpl.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return guest;
    }

    @Override
    public Guest register(String username, String email, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

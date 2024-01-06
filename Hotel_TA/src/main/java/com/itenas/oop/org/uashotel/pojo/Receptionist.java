/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.org.uashotel.pojo;

/**
 *
 * @author User
 */
public class Receptionist {
    private int idReceptionist;
    private String namaReceptionist;
    private String numberReceptionist;
    private boolean loginStatus;
    private Account account;

    public Receptionist() {
    }

    public int getIdReceptionist() {
        return idReceptionist;
    }

    public void setIdReceptionist(int idReceptionist) {
        this.idReceptionist = idReceptionist;
    }


    public String getNamaReceptionist() {
        return namaReceptionist;
    }

    public void setNamaReceptionist(String namaReceptionist) {
        this.namaReceptionist = namaReceptionist;
    }

    public String getNumberReceptionist() {
        return numberReceptionist;
    }

    public void setNumberReceptionist(String numberReceptionist) {
        this.numberReceptionist = numberReceptionist;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
    
    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }
    
    
}

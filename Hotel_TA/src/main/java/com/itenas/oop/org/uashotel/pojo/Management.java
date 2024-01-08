/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.org.uashotel.pojo;

/**
 *
 * @author apple
 */
public class Management {
    private int id;
    private String nama;
    private boolean loginStatus;
    private Account akun;

    public Management() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Account getAkun() {
        return akun;
    }

    public void setAkun(Account akun) {
        this.akun = akun;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.org.uashotel.pojo;

/**
 *
 * @author Nicholas
 */
public class Guest {
    private int ID_Guests;
    private int ID_Acc; // Foreign Key
    private String guest_name;
    private String guest_gender;
    private String guest_pnumber;
    private int guest_age;

    public Guest(int ID_Guests, int ID_Acc, String guest_name, String guest_gender, String guest_pnumber, int guest_age) {
        this.ID_Guests = ID_Guests;
        this.ID_Acc = ID_Acc;
        this.guest_name = guest_name;
        this.guest_gender = guest_gender;
        this.guest_pnumber = guest_pnumber;
        this.guest_age = guest_age;
    }

    public int getID_Guests() {
        return ID_Guests;
    }

    public void setID_Guests(int ID_Guests) {
        this.ID_Guests = ID_Guests;
    }

    public int getID_Acc() {
        return ID_Acc;
    }

    public void setID_Acc(int ID_Acc) {
        this.ID_Acc = ID_Acc;
    }

    public String getGuest_name() {
        return guest_name;
    }

    public void setGuest_name(String guest_name) {
        this.guest_name = guest_name;
    }

    public String getGuest_gender() {
        return guest_gender;
    }

    public void setGuest_gender(String guest_gender) {
        this.guest_gender = guest_gender;
    }

    public String getGuest_pnumber() {
        return guest_pnumber;
    }

    public void setGuest_pnumber(String guest_pnumber) {
        this.guest_pnumber = guest_pnumber;
    }

    public int getGuest_age() {
        return guest_age;
    }

    public void setGuest_age(int guest_age) {
        this.guest_age = guest_age;
    }
}

    
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itenas.oop.org.uashotel.service;

import com.itenas.oop.org.uashotel.pojo.Guest;

/**
 *
 * @author Nicholas
 */
public interface GuestService {
    Guest read(int guestID);
    void update(Guest guest);
    String findRoom(int guestID);
    void bookRoom(int guestID, String roomType);
}


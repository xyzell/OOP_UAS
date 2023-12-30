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
// GuestService.java

import com.itenas.oop.org.uashotel.pojo.Guest;

public interface GuestService {
    void createGuest(Guest guest);
    Guest readGuest(int guestId);
    void updateGuest(Guest guest);
}


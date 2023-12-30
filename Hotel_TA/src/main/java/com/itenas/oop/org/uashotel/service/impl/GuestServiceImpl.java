/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.org.uashotel.service.impl;

// GuestServiceImpl.java

import com.itenas.oop.org.uashotel.pojo.Guest;
import com.itenas.oop.org.uashotel.service.GuestService;
import java.util.HashMap;
import java.util.Map;

public class GuestServiceImpl implements GuestService {
    private final Map<Integer, Guest> guests;

    public GuestServiceImpl() {
        this.guests = new HashMap<>();
    }

    @Override
    public void createGuest(Guest guest) {
        guests.put(guest.getID_Guests(), guest);
    }

    @Override
    public Guest readGuest(int guestId) {
        return guests.get(guestId);
    }

    @Override
    public void updateGuest(Guest guest) {
        guests.put(guest.getID_Guests(), guest);
    }
}



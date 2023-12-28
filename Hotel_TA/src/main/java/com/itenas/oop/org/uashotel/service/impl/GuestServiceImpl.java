/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.org.uashotel.service.impl;

import com.itenas.oop.org.uashotel.pojo.Guest;
import com.itenas.oop.org.uashotel.service.GuestService;
import java.util.HashMap;
import java.util.Map;

public class GuestServiceImpl implements GuestService {
    private Map<Integer, Guest> guestMap;
    private Map<Integer, String> roomMap;

    public GuestServiceImpl() {
        this.guestMap = new HashMap<>();
        this.roomMap = new HashMap<>();
    }

    @Override
    public Guest read(int guestID) {
        return guestMap.get(guestID);
    }

    @Override
    public void update(Guest guest) {
        if (guestMap.containsKey(guest.getID_Guests())) {
            guestMap.put(guest.getID_Guests(), guest);
            System.out.println("Guest information updated successfully.");
        } else {
            System.out.println("Guest not found. Update failed.");
        }
    }

    @Override
    public String findRoom(int guestID) {
        return roomMap.getOrDefault(guestID, "Room not found");
    }

    @Override
    public void bookRoom(int guestID, String roomType) {
        roomMap.put(guestID, roomType);
        System.out.println("Room booked successfully.");
    }
}

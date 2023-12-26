/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uashotel.service;

import com.itenas.oop.org.uashotel.pojo.Guest;
import java.util.List;

/**
 *
 * @author Nicholas
 */
public interface GuestService {
    Guest getGuestById(int id);
    void addGuest(Guest guest);
    void updateGuest(Guest guest);
    void deleteGuestById(int id);
    List<Guest> getAllGuests();
}


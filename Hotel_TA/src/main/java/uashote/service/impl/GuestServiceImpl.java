/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uashote.service.impl;

/**
 *
 * @author Nicholas
 */
import com.itenas.oop.org.uashotel.pojo.Guest;
import java.util.ArrayList;
import java.util.List;
import uashotel.service.GuestService;

public class GuestServiceImpl implements GuestService {

    // This would be replaced by actual database access code
    private List<Guest> guestList = new ArrayList<>();

    @Override
    public Guest getGuestById(int id) {
        // Placeholder for database operation
        return guestList.stream()
                .filter(guest -> guest.getID_Guests() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void addGuest(Guest guest) {
        // Placeholder for database operation
        guestList.add(guest);
    }

    @Override
    public void updateGuest(Guest guest) {
        // Placeholder for database operation
        int index = guestList.indexOf(guest);
        if (index != -1) {
            guestList.set(index, guest);
        }
    }

    @Override
    public void deleteGuestById(int id) {
        // Placeholder for database operation
        guestList.removeIf(guest -> guest.getID_Guests() == id);
    }

    @Override
    public List<Guest> getAllGuests() {
        // Placeholder for database operation
        return new ArrayList<>(guestList);
    }
}


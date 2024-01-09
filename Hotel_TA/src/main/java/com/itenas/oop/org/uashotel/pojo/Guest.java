
package com.itenas.oop.org.uashotel.pojo;

/**
 *
 * @author Nicholas
 */
public class Guest {
    private int ID_Guest;
    private String guest_pnumber;
    private int guest_age;
    private boolean loginStatus;
    private Account account;

    public Guest() {
    }

    public int getID_Guest() {
        return ID_Guest;
    }

    public void setID_Guest(int ID_Guest) {
        this.ID_Guest = ID_Guest;
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

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    
}

    
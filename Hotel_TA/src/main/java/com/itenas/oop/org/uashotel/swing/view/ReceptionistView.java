/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.org.uashotel.swing.view;

import com.itenas.oop.org.uashotel.pojo.Receptionist;
import com.itenas.oop.org.uashotel.service.ReceptionistService;
import com.itenas.oop.org.uashotel.service.impl.ReceptionistLoginImpl;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class ReceptionistView {
    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        ReceptionistService adminService = new ReceptionistLoginImpl();
        Receptionist receptionist;
        String username, password;
        boolean login = false;

        do {
            System.out.println("+-------------------------------------------+");
            System.out.println("|LOGIN ADMIN                                |");
            System.out.println("+-------------------------------------------+");
            System.out.println("| Username: ");
            username = s.nextLine();
            System.out.println("| Password: ");
            password = s.nextLine();
            System.out.println("+-------------------------------------------+");
            System.out.println();
            receptionist = adminService.login(username, password);
            if (receptionist != null) {
                login = true;
                receptionist.setLoginStatus(true);
                System.out.println("Login berhasil...!");
                System.out.println("");
            } else {
                System.out.println("Username atau password yang Anda masukkan salah, coba lagi...!");
            }
        } while (!login);
        
    }
    
}

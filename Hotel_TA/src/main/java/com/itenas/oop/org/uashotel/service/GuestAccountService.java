/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itenas.oop.org.uashotel.service;

import com.itenas.oop.org.uashotel.pojo.Guest;
import com.itenas.oop.org.uashotel.repository.AkunRepository;

public interface GuestAccountService extends AkunRepository <Guest, Integer> {
    
}

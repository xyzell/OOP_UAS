/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.itenas.oop.org.uashotel.repository;

/**
 *
 * @author acer
 * @param <T>
 * @param <ID>
 */
public interface AkunRepository<T, ID> {
    T login(String username, String password);
}

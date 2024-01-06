/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.itenas.oop.org.uashotel.repository;

import java.util.List;

/**
 *
 * @author User
 */
public interface CrudRepository<T, ID> {
    List<T> findAll();
    ID create(T object);
    ID update(T object);
    T findById(String id);
    ID delete(String id);    
}

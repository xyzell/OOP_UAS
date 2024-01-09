
package com.itenas.oop.org.uashotel.repository;


public interface AkunRepository<T, ID> {
    T login(String username, String password);
    ID register(String username, String email, String password);

    
}

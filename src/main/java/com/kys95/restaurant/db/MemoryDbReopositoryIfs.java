package com.kys95.restaurant.db;

import java.util.List;
import java.util.Optional;

public interface MemoryDbReopositoryIfs<T> {
    Optional<T> findById(int index);
    T save(T entity);
    void deleteById(int index);
    List<T> findAll();
}

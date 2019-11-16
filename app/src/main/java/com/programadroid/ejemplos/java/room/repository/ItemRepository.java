package com.programadroid.ejemplos.java.room.repository;

import com.programadroid.ejemplos.java.room.database.entity.Item;

import java.util.List;

/**
 * creamos una interface para nuestro repositorio de items
 */
public interface ItemRepository {

    List<Item> getAllItems();
    Item findItemById(int id);
    void insertItem(Item item);
    void updateItem(Item item);
    void deleteItem(Item item);
}

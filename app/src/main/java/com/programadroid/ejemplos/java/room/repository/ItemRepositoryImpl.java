package com.programadroid.ejemplos.java.room.repository;

import com.programadroid.ejemplos.java.room.database.AppDatabase;
import com.programadroid.ejemplos.java.room.database.dao.ItemDAO;
import com.programadroid.ejemplos.java.room.database.entity.Item;

import java.util.List;

/**
 * creamos una clase que implemente ItemRepository
 */
public class ItemRepositoryImpl implements ItemRepository {
    /**
     * declaramos una variable global de nuestro DAO
     */
    ItemDAO dao;

    /**
     * necesitamos un constructor que recibe una instancia de nuestro dao
     * @param dao instancia de ItemDAO
     */
    public ItemRepositoryImpl(ItemDAO dao) {
        this.dao = dao;
    }

    /**
     * obtiene la lista de todos los items
     * @return lista de items
     */
    @Override
    public List<Item> getAllItems() {
        return dao.getAll();
    }

    /**
     * obtiene un Item filtrado por id
     * @param id del item
     * @return un item
     */
    @Override
    public Item findItemById(int id) {
        return dao.findById(id);
    }

    /**
     * inserta un item en la db
     * @param item
     */
    @Override
    public void insertItem(Item item) {
        dao.insert(item);
    }

    /**
     * actualiza un item en la db
     * @param item
     */
    @Override
    public void updateItem(Item item) {
        dao.update(item);
    }

    /**
     * elimina un item de la db
     * @param item
     */
    @Override
    public void deleteItem(Item item) {
        dao.delete(item);
    }
}

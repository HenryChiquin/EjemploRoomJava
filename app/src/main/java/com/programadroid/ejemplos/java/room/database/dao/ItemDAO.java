package com.programadroid.ejemplos.java.room.database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.programadroid.ejemplos.java.room.database.entity.Item;

import java.util.List;

/**
 * Las interfaces que hacen las operaciones en la base de datos
 * deben estar anotadas con @Dao
 */
@Dao
public interface ItemDAO {

    /**
     * con @Query podemos construir nuestras consultas a las tablas
     * @return Lista de Items
     */
    @Query("select * from Item")
    List<Item> getAll();

    @Query("select * from Item where itemId = :itemId")
    Item findById(int itemId);

    /**
     * inserta datos en la tabla
     * @param item item a insertar
     */
    @Insert
    void insert(Item item);

    /**
     * actualiza un item en la tabla
     * @param item Item a actualizar
     */
    @Update
    void update(Item item);

    /**
     * elimina un item de la tabla
     * @param item item a eliminar
     */
    @Delete
    void delete(Item item);
}

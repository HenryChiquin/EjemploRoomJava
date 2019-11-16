package com.programadroid.ejemplos.java.room.database.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Las clases que representan nuestras tablas deben estar anotadas con @Entity
 * opcionalmente se puede establecer el nombre de la tabla si queremos que nuestra
 * tabla y nuestra clase tengan nombre diferentes
 */
@Entity(tableName = "Item")
public class Item {

    /**
     * Con Room todas nuestras tablas deben tener un primary key y la anotamos con @PrimaryKey
     * ademas podemos definir si esta será auto generada o no (true/false)
     */
    @PrimaryKey(autoGenerate = true)
    private int itemId;
    /**
     * @ColumnInfo: opcionalmente podemos establecer el nombre de la columna
     * por defecto la columna tendra el mismo nombre que la variable
     * @NoNull: columna no acepta nulos
     */
    @NonNull
    @ColumnInfo(name = "nombre")
    private String nombre;

    /**
     * por defecto los tipos de datos primitivos no aceptan valores nulos
     * establecemos un valor por defecto en false
     */
    @ColumnInfo(defaultValue = "false")
    private boolean isChecked;

    /******************************************************************************
     * Importante no olvidar agregar los metodos get y set para cada columna
     *****************************************************************************/
    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}

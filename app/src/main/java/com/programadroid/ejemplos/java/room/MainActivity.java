package com.programadroid.ejemplos.java.room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.programadroid.ejemplos.java.room.database.AppDatabase;
import com.programadroid.ejemplos.java.room.database.entity.Item;
import com.programadroid.ejemplos.java.room.repository.ItemRepository;
import com.programadroid.ejemplos.java.room.repository.ItemRepositoryImpl;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * creamos una instancia de la base de datos
         */

        AppDatabase db = AppDatabase.getInstance(this.getApplicationContext());

        /**
         * creamos una instancia del repositorio de items
         */
        ItemRepository repo = new ItemRepositoryImpl(db.itemDAO());

        /**
         * creamos un objeto de la tabla Item
         */
        Item item = new Item();
        item.setNombre("item 1");
        item.setChecked(false);
        /**
         * Insert un nuevo item
         */
        repo.insertItem(item);

        /**
         * obtenemos los datos de la tabla item
         */
        List<Item> items = repo.getAllItems();
        for(Item i : items) {
            Log.d("EjemploRoomJava", "itemId: "+i.getItemId()+
                    ", Nombre: "+i.getNombre()+
                    ", isChecked: "+i.isChecked());
        }

        /**
         * actualizamos el item
         * reemplazar el id por el ultimo insertado de lo contrario dara una excepcion
         */
        Item itemU = repo.findItemById(1);
        itemU.setChecked(true);
        repo.updateItem(itemU);

        /**
         * eliminamos el item
         * reemplazar el id por el ultimo insertado de lo contrario dara una excepcion
         */
        Item itemD = repo.findItemById(1);
        repo.deleteItem(itemD);
    }
}

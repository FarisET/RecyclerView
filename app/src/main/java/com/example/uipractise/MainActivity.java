package com.example.uipractise;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactRecyclerView = findViewById(R.id.contactRecyclerView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Chris Hemsworth","faris.ejaz16@gmail.com","https://upload.wikimedia.org/wikipedia/commons/e/e8/Chris_Hemsworth_by_Gage_Skidmore_2_%28cropped%29.jpg"));
        contacts.add(new Contact("Robert Downy Jr","faris.ejaz16@gmail.com","https://e00-marca.uecdn.es/assets/multimedia/imagenes/2022/11/30/16698340048555.jpg"));
        contacts.add(new Contact("Tom Cruise","faris.ejaz16@gmail.com","https://flxt.tmsimg.com/assets/378_v9_be.jpg"));
        contacts.add(new Contact("Chris Evans","faris.ejaz16@gmail.com","https://cdn.britannica.com/28/215028-050-94E9EA1E/American-actor-Chris-Evans-2019.jpg"));
        contacts.add(new Contact("Chris Hemsworth","faris.ejaz16@gmail.com","https://upload.wikimedia.org/wikipedia/commons/e/e8/Chris_Hemsworth_by_Gage_Skidmore_2_%28cropped%29.jpg"));
        contacts.add(new Contact("Robert Downy Jr","faris.ejaz16@gmail.com","https://e00-marca.uecdn.es/assets/multimedia/imagenes/2022/11/30/16698340048555.jpg"));
        contacts.add(new Contact("Tom Cruise","faris.ejaz16@gmail.com","https://flxt.tmsimg.com/assets/378_v9_be.jpg"));
        contacts.add(new Contact("Chris Evans","faris.ejaz16@gmail.com","https://cdn.britannica.com/28/215028-050-94E9EA1E/American-actor-Chris-Evans-2019.jpg"));
        contacts.add(new Contact("Chris Hemsworth","faris.ejaz16@gmail.com","https://upload.wikimedia.org/wikipedia/commons/e/e8/Chris_Hemsworth_by_Gage_Skidmore_2_%28cropped%29.jpg"));
        contacts.add(new Contact("Robert Downy Jr","faris.ejaz16@gmail.com","https://e00-marca.uecdn.es/assets/multimedia/imagenes/2022/11/30/16698340048555.jpg"));
        contacts.add(new Contact("Tom Cruise","faris.ejaz16@gmail.com","https://flxt.tmsimg.com/assets/378_v9_be.jpg"));
        contacts.add(new Contact("Chris Evans","faris.ejaz16@gmail.com","https://cdn.britannica.com/28/215028-050-94E9EA1E/American-actor-Chris-Evans-2019.jpg"));

        ContactRecyclerAdaptor adapter = new ContactRecyclerAdaptor(this);
        adapter.setContacts(contacts);
        contactRecyclerView.setAdapter(adapter);
        contactRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));


            }
}
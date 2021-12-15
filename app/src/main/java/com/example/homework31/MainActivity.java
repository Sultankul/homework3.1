package com.example.homework31;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    ArrayList<Information> informations = new ArrayList<Information>();
    private adapterContact adapter;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView.findViewById(R.id.recycler);
        adapter = new adapterContact(this,informations);
        recyclerView.setAdapter(adapter);
        loadData();


    }

    private void loadData(){
    informations.add(new Information("kdkdf",26789,R.drawable.contact));
    informations.add(new Information("wefe",2987,R.drawable.contact));
    informations.add(new Information("kljs",209876,R.drawable.contact));
    informations.add(new Information("ksdf",276879,R.drawable.contact));
    informations.add(new Information("kdsdsdfd",9999,R.drawable.contact));
    informations.add(new Information("dlkms",2632,R.drawable.contact));
    informations.add(new Information("lskkj",238082,R.drawable.contact));

    }
}


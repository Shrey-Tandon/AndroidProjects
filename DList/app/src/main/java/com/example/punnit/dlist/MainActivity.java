package com.example.punnit.dlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lt;
    ArrayList<String>nm,mb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lt=(ListView)findViewById(R.id.mylist);

        nm=new ArrayList<>();
        mb=new ArrayList<>();
        nm.add("Rajat");
        mb.add("9024960826");
        nm.add("Harsh");
        mb.add("7976192564");
        nm.add("Vijay");
        mb.add("898980989");
        nm.add("Rajat");
        mb.add("9024960826");
        nm.add("Harsh");
        mb.add("7976192564");
        nm.add("Vijay");
        mb.add("898980989"); nm.add("Rajat");
        mb.add("9024960826");
        nm.add("Harsh");
        mb.add("7976192564");
        nm.add("Vijay");
        mb.add("898980989"); nm.add("Rajat");
        mb.add("9024960826");
        nm.add("Harsh");
        mb.add("7976192564");
        nm.add("Vijay");
        mb.add("898980989"); nm.add("Rajat");
        mb.add("9024960826");
        nm.add("Harsh");
        mb.add("7976192564");
        nm.add("Vijay");
        mb.add("898980989");

        Mydesign obj=new Mydesign(MainActivity.this,nm,mb);
        lt.setAdapter(obj);
    }
}

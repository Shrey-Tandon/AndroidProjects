package com.example.punnit.threadapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    ListView l;
    String[] data={"Mantreeji","toggle","shrey","Tajmahal"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        l=findViewById(R.id.list);
        ArrayAdapter<String> obj;
        obj=new ArrayAdapter<String>(Main2Activity.this,R.layout.support_simple_spinner_dropdown_item,data);
        l.setAdapter(obj);
    }
}


package com.example.punnit.searchbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     AutoCompleteTextView t;
     String name[]={"Aman","Anuj","Anita","Rajat","Rani","Rahul","Riya","Pawan","Punit","Pinky","Chandu","Chadni"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String>obj;

        obj=new ArrayAdapter<>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,name);

           t.setThreshold(1);
           t.setAdapter(obj);

           t.setOnItemClickListener(new AdapterView.OnItemClickListener() {
               @Override
               public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                   Toast.makeText(MainActivity.this, "Position="+i, Toast.LENGTH_SHORT).show();
               }
           });
    }
}

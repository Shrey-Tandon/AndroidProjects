package com.example.punnit.spinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Spinner sp;
    String name[]={"Select Name.","Aman","Anuj","Anita","Rajat","Rani","Rahul","Rakesh"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=(Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String>obj;
        obj=new ArrayAdapter<>(MainActivity.this,R.layout.support_simple_spinner_dropdown_item,name);

         sp.setAdapter(obj);

         sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                 String data=(String)adapterView.getItemAtPosition(i);

                 Toast.makeText(MainActivity.this, ""+data, Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onNothingSelected(AdapterView<?> adapterView) {

             }
         });
    }
}

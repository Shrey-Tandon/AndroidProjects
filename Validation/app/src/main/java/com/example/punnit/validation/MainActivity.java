package com.example.punnit.validation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e,e1,e2,e3;
    Button b,b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e=(EditText)findViewById(R.id.editText);
        e1=(EditText)findViewById(R.id.editText2);
        e2=(EditText)findViewById(R.id.editText3);
        e3=(EditText)findViewById(R.id.editText4);
        b=(Button)findViewById(R.id.button);
        b1=(Button)findViewById(R.id.button2);

    }
    public void event(View v)
    {
     String id=e.getText().toString();
     String name=e1.getText().toString();
     String mob=e2.getText().toString();
     int m=Integer.parseInt(mob);
     String branch=e3.getText().toString();
     if(id.isEmpty()||name.isEmpty()||mob.isEmpty()||branch.isEmpty())
     {
         e.setError("Please Enter ID");
         e1.setError("Please Enter Name");
         e2.setError("Please Enter Mobile");
         e3.setError("Please Enter Branch");
     }

    }
}

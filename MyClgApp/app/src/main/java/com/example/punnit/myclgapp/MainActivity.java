package com.example.punnit.myclgapp;

import android.app.SearchManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button b,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b.setOnClickListener(this);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        if (view.getId()==R.id.button)
        {
            Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        }
        if (view.getId()==R.id.button2)
        {
            Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT).show();
        }
    }
}

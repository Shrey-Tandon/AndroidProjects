package com.example.punnit.myclgapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Second extends AppCompatActivity implements View.OnClickListener {
    Button bck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        bck=(Button)findViewById(R.id.button2);
        bck.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i=new Intent(Second.this,MainActivity.class);
        startActivity(i);
    }
}

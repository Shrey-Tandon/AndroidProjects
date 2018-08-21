package com.example.punnit.intent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class First extends AppCompatActivity implements View.OnClickListener {
    Button b;
    EditText e;
    static  String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        b=(Button)findViewById(R.id.button);
        e=(EditText)findViewById(R.id.editText);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        data=e.getText().toString();
        Intent i=new Intent(First.this,Second.class);
        startActivity(i);
        e.setText(null);
    }
}

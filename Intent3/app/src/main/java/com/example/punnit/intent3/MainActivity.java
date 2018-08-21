package com.example.punnit.intent3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        e=(EditText)findViewById(R.id.editText);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
       String data=e.getText().toString();
        Intent i=new Intent(this,Second.class);
        i.putExtra("k",data);
        startActivity(i);
        e.setText(null);
    }
}

package com.example.punnit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b,b2;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        t=(TextView)findViewById(R.id.editText);
    }
    public void myEvent(View v)
    {
        t.setText("Jai Mata Di ");
    }
    public void myEvent2(View v)
    {
        t.setText("");
    }
}

package com.example.punnit.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Test extends AppCompatActivity {
    Button b;
    EditText ed;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.design);
        b=(Button)findViewById(R.id.bottom);
        ed=(EditText)findViewById(R.id.editText);
        t=(TextView)findViewById(R.id.textView);
    }
    public void myEvent(View v)
    {
        String s=ed.getText().toString();
        t.setText(s);
        ed.setText(null);
    }
}

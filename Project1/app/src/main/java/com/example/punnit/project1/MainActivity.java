package com.example.punnit.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText e1,e2,e3,e4;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=e1.getText().toString();
                String id=e2.getText().toString();
                String pass=e3.getText().toString();
                String repass=e4.getText().toString();
                boolean invalid=false;
                if(name.equals("")){
                    invalid=true;
                    Toast.makeText(MainActivity.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                }
                else if(id.equals("")){
                    invalid=true;
                    Toast.makeText(MainActivity.this, "Please enter ID", Toast.LENGTH_SHORT).show();
                }
                else if (pass.equals("")){
                    invalid=true;
                    Toast.makeText(MainActivity.this, "Please enter Password", Toast.LENGTH_SHORT).show();
                }
                else if (repass.equals("")){
                    invalid=true;
                    Toast.makeText(MainActivity.this, "Please Re-Enter Password", Toast.LENGTH_SHORT).show();
                }
                else if (repass.equals(pass))
                {
                    invalid=true;
                    Toast.makeText(MainActivity.this, "Please enter Same Password", Toast.LENGTH_SHORT).show();
                }else{
                Toast.makeText(MainActivity.this, "Successful Register", Toast.LENGTH_LONG).show();
                Intent i2=new Intent(MainActivity.this,Menu_Card.class);
                startActivity(i2);}
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,Login.class);
                startActivity(i);
            }
        });
        e1.setText(null);
        e2.setText(null);
        e3.setText(null);
        e4.setText(null);
    }
}

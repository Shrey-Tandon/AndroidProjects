package com.example.punnit.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Button b3;
    EditText e5,e6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        b3=(Button)findViewById(R.id.button3);
        e5=(EditText)findViewById(R.id.editText5);
        e6=(EditText)findViewById(R.id.editText6);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = e5.getText().toString();
                String pass = e6.getText().toString();
                boolean invalid = false;
                if (name.equals("")) {
                    invalid = true;
                    Toast.makeText(Login.this, "Please enter your name", Toast.LENGTH_SHORT).show();
                } else if (!name.equals("Punit")) {
                    invalid = true;
                    Toast.makeText(Login.this, "Enter correct name", Toast.LENGTH_SHORT).show();
                } else if (pass.equals("")) {
                    invalid = true;
                    Toast.makeText(Login.this, "Please enter Password", Toast.LENGTH_SHORT).show();
                } else if (!pass.equals("punit")) {
                    invalid = true;
                    Toast.makeText(Login.this, "Please Enter correct Password", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Login.this, "Successful Login", Toast.LENGTH_SHORT).show();
                    Intent i3 = new Intent(Login.this, Menu_Card.class);
                    startActivity(i3);

                }
            }

        });
        e5.setText(null);
        e6.setText(null);
    }
}

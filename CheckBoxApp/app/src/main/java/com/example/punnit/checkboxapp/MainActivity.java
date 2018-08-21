package com.example.punnit.checkboxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    CheckBox c1,c2,c3;
    Button k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox)findViewById(R.id.checkBox);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        c3=(CheckBox)findViewById(R.id.checkBox3);
        k=(Button)findViewById(R.id.button);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String info="";
                if(c1.isChecked()==true)
                {
                    info=info+c1.getText().toString();
                }
                if(c2.isChecked()==true)
                {
                    info=info+c2.getText().toString();
                }
                if(c3.isChecked()==true)
                {
                    info=info+c3.getText().toString();
                }
                Toast.makeText(MainActivity.this, ""+info, Toast.LENGTH_SHORT).show();
            }
        });

    }
}

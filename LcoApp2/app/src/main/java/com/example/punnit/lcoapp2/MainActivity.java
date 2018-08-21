package com.example.punnit.lcoapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText ed;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed=findViewById(R.id.editText);
        t=findViewById(R.id.tv);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int no=Integer.parseInt((ed.getText().toString()));
                for (int i=1;i<=10;i++){
                    t.append(""+no+" * "+i+" = "+(no*i)+"\n");
                }
            }
        });
    }
}

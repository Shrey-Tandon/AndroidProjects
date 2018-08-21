package com.example.punnit.lcoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button pre,next;
    TextView t;
    int table=2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pre=findViewById(R.id.pre);
        next=findViewById(R.id.next);
        t=findViewById(R.id.textView);

        for (int i=1;i<=10;i++)
        {
            t.append(""+table+" * "+i+" = "+(table*i)+"\n");
        }
        pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table--;
                t.setText(null);
                for (int i=1;i<=10;i++)
                {
                    t.append(""+table+" * "+i+" = "+(table*i)+"\n");
                }
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                table++;
                t.setText(null);
                for (int i=1;i<=10;i++)
                {
                    t.append(""+table+" * "+i+" = "+(table*i)+"\n");
                }
            }
        });

    }
}

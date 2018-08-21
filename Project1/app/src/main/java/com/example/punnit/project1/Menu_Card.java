package com.example.punnit.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class Menu_Card extends AppCompatActivity {
    CheckBox c,c1,c2,c3,c4,c5;
    Button b,b1,b2,b3,b4,b5,con;
    TextView t,t1,t2,t3,t4,t5;
    TextView tv,tv1,tv2,tv3,tv4,tv5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__card);
        c = (CheckBox) findViewById(R.id.cb);
        c1 = (CheckBox) findViewById(R.id.produ1);
        c2 = (CheckBox) findViewById(R.id.produ2);
        c3 = (CheckBox) findViewById(R.id.produ3);
        c4 = (CheckBox) findViewById(R.id.produ4);
        c5 = (CheckBox) findViewById(R.id.produ5);

        b = (Button)findViewById(R.id.uni);
        b1 = (Button)findViewById(R.id.uni1);
        b2 = (Button)findViewById(R.id.uni2);
        b3 = (Button)findViewById(R.id.uni3);
        b4 = (Button)findViewById(R.id.uni4);
        b5 = (Button)findViewById(R.id.uni5);
        con = (Button)findViewById(R.id.cont);

        t = (TextView) findViewById(R.id.pri);
        t1 = (TextView) findViewById(R.id.pri1);
        t2 = (TextView) findViewById(R.id.pri2);
        t3 = (TextView) findViewById(R.id.pri3);
        t4 = (TextView) findViewById(R.id.pri4);
        t5 = (TextView) findViewById(R.id.pri5);

        tv = (TextView) findViewById(R.id.tv);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info = "";
                if (c.isChecked()==true) {
                    int price = 25;
                    int u = parseInt(tv.getText().toString());
                    int p = parseInt(t.getText().toString());
                    int pri = p + price;
                    u++;
                    tv.setText(Integer.toString(u));
                    t.setText(Integer.toString(pri));
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info = "";
                if (c1.isChecked()==true) {
                    int price = 40;
                    int u = parseInt(tv1.getText().toString());
                    int p = parseInt(t1.getText().toString());
                    int pri = p + price;
                    u++;
                    tv1.setText(Integer.toString(u));
                    t1.setText(Integer.toString(pri));
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info = "";
                if (c2.isChecked()==true) {
                    int price = 100;
                    int u = parseInt(tv2.getText().toString());
                    int p = parseInt(t2.getText().toString());
                    int pri = p + price;
                    u++;
                    tv2.setText(Integer.toString(u));
                    t2.setText(Integer.toString(pri));
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info = "";
                if (c3.isChecked()==true) {
                    int price = 150;
                    int u = parseInt(tv3.getText().toString());
                    int p = parseInt(t3.getText().toString());
                    int pri = p + price;
                    u++;
                    tv3.setText(Integer.toString(u));
                    t3.setText(Integer.toString(pri));
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String info = "";
                if (c4.isChecked()==true) {
                    int price = 75;
                    int u = parseInt(tv4.getText().toString());
                    int p = parseInt(t4.getText().toString());
                    int pri = p + price;
                    u++;
                    tv4.setText(Integer.toString(u));
                    t4.setText(Integer.toString(pri));
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (c5.isChecked()==true) {
                    int price = 150;
                    int u = parseInt(tv5.getText().toString());
                    int p = parseInt(t5.getText().toString());
                    int pri = p + price;
                    u++;
                    tv5.setText(Integer.toString(u));
                    t5.setText(Integer.toString(pri));
                }
            }
        });
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Menu_Card.this, Confirm.class);
                if (c.isChecked()==true) {
                    String a1 = c.getText().toString();
                    String a2 = t.getText().toString();
                    String a3 = tv.getText().toString();
                    i.putExtra("a1", a1);
                    i.putExtra("a2", a2);
                    i.putExtra("a3", a3);
                    startActivity(i);
                }
                 if (c1.isChecked()==true) {
                    String b1 = c1.getText().toString();
                    String b2 = tv1.getText().toString();
                    String b3 = t1.getText().toString();
                    i.putExtra("b1", b1);
                    i.putExtra("b2", b2);
                    i.putExtra("b3", b3);
                    startActivity(i);
                }
                if (c2.isChecked()==true) {
                    String c1 = c2.getText().toString();
                    String c2 = tv2.getText().toString();
                    String c3 = t2.getText().toString();
                    i.putExtra("c1", c1);
                    i.putExtra("c2", c2);
                    i.putExtra("c3", c3);
                    startActivity(i);
                }
                 if (c3.isChecked()==true) {
                    String d1 = c3.getText().toString();
                    String d2 = tv3.getText().toString();
                    String d3 = t3.getText().toString();
                    i.putExtra("d1", d1);
                    i.putExtra("d2", d2);
                    i.putExtra("d3", d3);
                    startActivity(i);
                }
                if (c4.isChecked()==true) {
                    String e1 = c4.getText().toString();
                    String e2 = tv4.getText().toString();
                    String e3 = t4.getText().toString();
                    i.putExtra("e1", e1);
                    i.putExtra("e2", e2);
                    i.putExtra("e3", e3);
                    startActivity(i);
                }
                if (c5.isChecked()==true) {
                    String f1 = c5.getText().toString();
                    String f2 = tv5.getText().toString();
                    String f3 = t5.getText().toString();
                    i.putExtra("f1", f1);
                    i.putExtra("f2", f2);
                    i.putExtra("f3", f3);
                    startActivity(i);
                }

            }
        });
    }
}

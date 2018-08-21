package com.example.punnit.project1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Confirm extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16,tv17,tv18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        tv1 = (TextView)findViewById(R.id.text1);
        tv2 = (TextView)findViewById(R.id.text2);
        tv3 = (TextView)findViewById(R.id.text3);
        tv4 = (TextView)findViewById(R.id.text4);
        tv5 = (TextView)findViewById(R.id.text5);
        tv6 = (TextView)findViewById(R.id.text6);
        tv7 = (TextView)findViewById(R.id.text7);
        tv8 = (TextView)findViewById(R.id.text8);
        tv9 = (TextView)findViewById(R.id.text9);
        tv10 = (TextView)findViewById(R.id.text10);
        tv11= (TextView)findViewById(R.id.text11);
        tv12= (TextView)findViewById(R.id.text12);
        tv13= (TextView)findViewById(R.id.text13);
        tv14 = (TextView)findViewById(R.id.text14);
        tv15 = (TextView)findViewById(R.id.text15);
        tv16 = (TextView)findViewById(R.id.text16);
        tv17 = (TextView)findViewById(R.id.text17);
        tv18 = (TextView)findViewById(R.id.text18);
        Intent re = getIntent();
        String r1 = re.getStringExtra("a1");
        String r2 = re.getStringExtra("a2");
        String r3 = re.getStringExtra("a3");
        String r4 = re.getStringExtra("b1");
        String r5 = re.getStringExtra("b2");
        String r6 = re.getStringExtra("b3");
        String r7 = re.getStringExtra("c1");
        String r8 = re.getStringExtra("c2");
        String r9 = re.getStringExtra("c3");
        String r10= re.getStringExtra("d1");
        String r11= re.getStringExtra("d2");
        String r12 = re.getStringExtra("d3");
        String r13 = re.getStringExtra("e1");
        String r14 = re.getStringExtra("e2");
        String r15 = re.getStringExtra("e3");
        String r16 = re.getStringExtra("f1");
        String r17 = re.getStringExtra("f2");
        String r18 = re.getStringExtra("f3");
        tv1.setText(r1);
        tv2.setText(r2);
        tv3.setText(r3);
        tv4.setText(r4);
        tv5.setText(r5);
        tv6.setText(r6);
        tv7.setText(r7);
        tv8.setText(r8);
        tv9.setText(r9);
        tv10.setText(r10);
        tv11.setText(r11);
        tv12.setText(r12);
        tv13.setText(r13);
        tv14.setText(r14);
        tv15.setText(r15);
        tv16.setText(r16);
        tv17.setText(r17);
        tv18.setText(r18);

    }
}

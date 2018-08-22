package com.example.punnit.threadapp;

import android.animation.Animator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2;
    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=findViewById(R.id.imageView);
        tv1=findViewById(R.id.textView);
        tv2=findViewById(R.id.textView2);
        Thread th=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);

                }catch (Exception e){}
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
            }
        });
        th.start();
       // YoYo.with(Techniques.Flash).duration(4000).playOn(i);
        YoYo.with(Techniques.Hinge).duration(2000).withListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {


            }

            @Override
            public void onAnimationEnd(Animator animation) {
                YoYo.with(Techniques.FlipInX).duration(3000).playOn(tv1);
                YoYo.with(Techniques.FlipInY).duration(3000).playOn(tv2);
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        }).playOn(i);
    }
}

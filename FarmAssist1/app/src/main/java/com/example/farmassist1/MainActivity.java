package com.example.farmassist1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        try {
//            Thread.sleep(2000);
//            startActivity(new Intent(this,Main2Activity.class));
//        }
//        catch (InterruptedException e)
//        {
//
//        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(i);
                finish();
            }
        },3000);

    }
}

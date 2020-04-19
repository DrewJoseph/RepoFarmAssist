package com.example.farmassist;

import android.content.Intent;
import android.os.Bundle;
import java.lang.Thread;
import java.lang.InterruptedException;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            Thread.sleep(5+000);
        }
        catch (InterruptedException e)
        {

        }
        startActivity(new Intent(this,MainActivity.class));
    }
}

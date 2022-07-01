package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Thread th = new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4000);
                }catch (Exception e){
                    Toast.makeText(SplashScreen.this, ""+e, Toast.LENGTH_SHORT).show();
                }
                finally {
                    Intent intent = new Intent(SplashScreen.this ,MainActivity.class );
                    startActivity(intent);
                }
            }
        };th.start();
    }
}
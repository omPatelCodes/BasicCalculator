package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1 , et2;
    TextView ans;
    Button add , sub , mul , div;
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.linearlayout);
        et1 = findViewById(R.id.firstVal);
        et2 = findViewById(R.id.secondVal);
        ans = findViewById(R.id.ans);
        add = findViewById(R.id.plus);
        sub = findViewById(R.id.minus);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);

        add.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int a , b , sum;
                a = Integer.parseInt(et1.getText().toString());
                b = Integer.parseInt(et2.getText().toString());
                sum = a+b;
                ans.setText(" "+sum);
            }
        });sub.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int a , b , sum;
                a = Integer.parseInt(et1.getText().toString());
                b = Integer.parseInt(et2.getText().toString());
                sum = a-b;
                ans.setText(" "+sum);
            }
        });mul.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int a , b , sum;
                a = Integer.parseInt(et1.getText().toString());
                b = Integer.parseInt(et2.getText().toString());
                sum = a*b;
                ans.setText(" "+sum);
            }
        });div.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                int a , b , sum;
                a = Integer.parseInt(et1.getText().toString());
                b = Integer.parseInt(et2.getText().toString());
                sum = a/b;
                ans.setText(" "+sum);
            }
        });
    }
}
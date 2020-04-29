package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
RadioButton r1,r2,r3;
Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1=findViewById(R.id.radioButton2);
        r2=findViewById(R.id.radioButton3);
        r3=findViewById(R.id.radioButton4);
        b=findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean a,b,c;
                a=r1.isChecked();
                b=r2.isChecked();
                c=r3.isChecked();
                Log.i("checked",a+" "+b+" "+c);
            }
        });








    }

    }





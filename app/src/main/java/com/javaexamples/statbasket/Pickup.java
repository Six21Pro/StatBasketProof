package com.javaexamples.statbasket;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pickup extends AppCompatActivity {

    Button LBtn, RBtn, LSubBtn, RSubBtn, Home;
public int a =0;public int b =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickup);



        Home = findViewById(R.id.HomeBtn);
        LBtn= findViewById(R.id.BigLeftBtn);
        RBtn = findViewById(R.id.BigRightBtn);
        LSubBtn = findViewById(R.id.LeftSubBtn);
        RSubBtn = findViewById(R.id.RightSubBtn);
        Home.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //String userName = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                //i.putExtra("name", userName);
                startActivity(i);
            }
        });

        LBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                a++;
                String str = Integer.toString(a);
                LBtn.setText(str);
            }
        });
        RBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                b++;
                String str2 = Integer.toString(b);
                RBtn.setText(str2);
            }
        });

        LSubBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                a--;
                String str3 = Integer.toString(a);
                LBtn.setText(str3);
            }
        });
        RSubBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                b--;
                String str3 = Integer.toString(b);
                RBtn.setText(str3);
            }
        });
    }

}
package com.javaexamples.statbasket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView tView;
    Button PUbtn,Rbtn,OGbtn;
    //EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tView = findViewById(R.id.textView);

        PUbtn = findViewById(R.id.button);
        Rbtn = findViewById(R.id.button2);
        OGbtn = findViewById(R.id.button3);
       // editText = findViewById(R.id.editText);
        PUbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //String userName = editText.getText().toString();
                Intent i = new Intent(getApplicationContext(), Pickup.class);
                //i.putExtra("name", userName);
                startActivity(i);
            }
        });
        Rbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //String userName = editText.getText().toString();
                Intent o = new Intent(getApplicationContext(), Roster.class);
                //i.putExtra("name", userName);
                startActivity(o);
            }
        });

        OGbtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                //String userName = editText.getText().toString();
                Intent u = new Intent(getApplicationContext(), Opponents.class);
                //i.putExtra("name", userName);
                startActivity(u);
            }
        });
    }
}
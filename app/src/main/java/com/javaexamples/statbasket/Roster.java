package com.javaexamples.statbasket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Roster extends AppCompatActivity {

    Button gameTimeBtn;
    EditText tName,num1,num2,num3,num4,num5,num6;
    EditText name1,name2,name3,name4,name5,name6;
    EditText rank1,rank2,rank3,rank4,rank5,rank6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roster);

        gameTimeBtn = findViewById(R.id.toGameBtn);
        tName = findViewById(R.id.tName);
        num1 = findViewById(R.id.num1);num2 = findViewById(R.id.num2);num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);num5 = findViewById(R.id.num5);num6 = findViewById(R.id.num6);

        name1 = findViewById(R.id.name1);name2 = findViewById(R.id.name2);name3 = findViewById(R.id.name3);
        name4 = findViewById(R.id.name4);name5 = findViewById(R.id.name5);name6 = findViewById(R.id.name6);

        rank1 = findViewById(R.id.rank1);rank2 = findViewById(R.id.rank2);rank3 = findViewById(R.id.rank3);
        rank4 = findViewById(R.id.rank4);rank5 = findViewById(R.id.rank5);rank6 = findViewById(R.id.rank6);

        gameTimeBtn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                int a=2;

                String number1 = num1.getText().toString();String number2 = num2.getText().toString();
                String number3 = num3.getText().toString();String number4 = num4.getText().toString();
                String number5 = num5.getText().toString();String number6 = num6.getText().toString();
                String teamName =tName.getText().toString();
                String pName1 = name1.getText().toString();String pName2 = name2.getText().toString();
                String pName3 = name3.getText().toString();String pName4 = name4.getText().toString();
                String pName5 = name5.getText().toString();String pName6 = name6.getText().toString();

                String pRank1 = rank1.getText().toString();String pRank2 = rank2.getText().toString();
                String pRank3 = rank3.getText().toString();String pRank4 = rank4.getText().toString();
                String pRank5 = rank5.getText().toString();String pRank6 = rank6.getText().toString();

                Intent g = new Intent(getApplicationContext(), GameTime.class);
                g.putExtra("int",a);

                g.putExtra("num1",number1);g.putExtra("num2",number2);g.putExtra("num3",number3);
                g.putExtra("num4",number4);g.putExtra("num5",number5);g.putExtra("num6",number6);
                g.putExtra("tName",teamName);
                g.putExtra("name1",pName1);g.putExtra("name2",pName2);g.putExtra("name3",pName3);
                g.putExtra("name4",pName4);g.putExtra("name5",pName5);g.putExtra("name6",pName6);

                g.putExtra("rank1",pRank1);g.putExtra("rank2",pRank2);g.putExtra("rank3",pRank3);
                g.putExtra("rank4",pRank4);g.putExtra("rank5",pRank5);g.putExtra("rank6",pRank6);
                startActivity(g);
            }
        });


    }
}
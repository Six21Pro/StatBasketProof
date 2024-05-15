package com.javaexamples.statbasket;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Opponents extends AppCompatActivity {
    EditText pts1,pts2,pts3,pts4,pts5,pts6;
    EditText rbs1,rbs2,rbs3,rbs4,rbs5,rbs6;
    EditText as1,as2,as3,as4,as5,as6;
    EditText fls1,fls2,fls3,fls4,fls5,fls6;
    EditText opponent1,opponent2,opponent3,opponent4,opponent5,opponent6,teName;
    TextView pts,rbs,as,fls;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opponents);

        share = findViewById(R.id.shareBtn);
        teName = findViewById(R.id.teName);

        pts = findViewById(R.id.pts);rbs = findViewById(R.id.rbs);as = findViewById(R.id.as);
        fls = findViewById(R.id.fls);
        opponent1 = findViewById(R.id.opponent1);opponent2 = findViewById(R.id.opponent2);opponent3 = findViewById(R.id.opponent3);
        opponent4 = findViewById(R.id.opponent4);opponent5 = findViewById(R.id.opponent5);opponent6 = findViewById(R.id.opponen6);

        pts1 = findViewById(R.id.pts1);pts2 = findViewById(R.id.pts2);pts3 = findViewById(R.id.pts3);
        pts4 = findViewById(R.id.pts4);pts5 = findViewById(R.id.pts5);pts6 = findViewById(R.id.pts6);

        rbs1 = findViewById(R.id.rbs1);rbs2 = findViewById(R.id.rbs2);rbs3 = findViewById(R.id.rbs3);
        rbs4 = findViewById(R.id.rbs4);rbs5 = findViewById(R.id.rbs5);rbs6 = findViewById(R.id.rbs6);

        as1 = findViewById(R.id.as1);as2 = findViewById(R.id.as2);as3 = findViewById(R.id.as3);
        as4 = findViewById(R.id.as4);as5 = findViewById(R.id.as5);as6 = findViewById(R.id.as6);

        fls1 = findViewById(R.id.fls1);fls2 = findViewById(R.id.fls2);fls3 = findViewById(R.id.fls3);
        fls4 = findViewById(R.id.fls4);fls5 = findViewById(R.id.fls5);fls6 = findViewById(R.id.fls6);

        Intent i = getIntent();

        share.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String opp1 = opponent1.getText().toString();String opp2 = opponent2.getText().toString();String opp3 = opponent3.getText().toString();
                String opp4 = opponent4.getText().toString();String opp5 = opponent5.getText().toString();String opp6 = opponent6.getText().toString();
                String teamName = teName.getText().toString();
                String points1 = pts1.getText().toString();String points2 = pts2.getText().toString();String points3 = pts3.getText().toString();
                String points4 = pts4.getText().toString();String points5 = pts5.getText().toString();String points6 = pts6.getText().toString();
                String rebounds1 = rbs1.getText().toString();String rebounds2 = rbs2.getText().toString();String rebounds3 = rbs3.getText().toString();
                String rebounds4 = rbs4.getText().toString();String rebounds5 = rbs5.getText().toString();String rebounds6 = rbs6.getText().toString();
                String assists1 = as1.getText().toString();String assists2 = as2.getText().toString();String assists3 = as3.getText().toString();
                String assists4 = as4.getText().toString();String assists5 = as5.getText().toString();String assists6 = as6.getText().toString();
                String fouls1 = fls1.getText().toString();String fouls2 = fls2.getText().toString();String fouls3 = fls3.getText().toString();
                String fouls4 = fls4.getText().toString();String fouls5 = fls5.getText().toString();String fouls6 = fls6.getText().toString();


                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT, " Statistics from the "+teamName+" game!");
                i.putExtra(Intent.EXTRA_TEXT, opp1+ " had "+points1+" points "+rebounds1+" rebounds "+assists1+" assists and "+fouls1+" fouls.\n"+
                        opp2+ " had "+points2+" points "+rebounds2+" rebounds "+assists2+" assists and "+fouls2+" fouls.\n"+
                        opp3+ " had "+points3+" points "+rebounds3+" rebounds "+assists3+" assists and "+fouls3+" fouls.\n"+
                        opp4+ " had "+points4+" points "+rebounds4+" rebounds "+assists4+" assists and "+fouls4+" fouls.\n"+
                        opp5+ " had "+points5+" points "+rebounds5+" rebounds "+assists5+" assists and "+fouls5+" fouls.\n"+
                        opp6+ " had "+points6+" points "+rebounds6+" rebounds "+assists6+" assists and "+fouls6+" fouls.\n");
                startActivity(Intent.createChooser(i, "choose a platform"));
            }
        });

    }
}
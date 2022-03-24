package com.example.countcenter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAScore=0;
    int teamBScore=0;
    TextView outA;
    TextView outB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outA=findViewById(R.id.teamAscore);
        outB=findViewById(R.id.teamBscore);
    }
    public void setTeamScore(View v){
        Log.i("main","onClick myBtn");
        switch (v.getId()){
            case R.id.btnA1:
                teamAScore+=1;
                outA.setText(""+teamAScore);
                break;
            case R.id.btnA2:
                teamAScore+=2;
                outA.setText(""+teamAScore);
                break;
            case R.id.btnA3:
                teamAScore+=3;
                outA.setText(""+teamAScore);
                break;
            case R.id.btnB1:
                teamBScore+=1;
                outB.setText(""+teamBScore);
                break;
            case R.id.btnB2:
                teamBScore+=2;
                outB.setText(""+teamBScore);
                break;
            case R.id.btnB3:
                teamBScore+=3;
                outB.setText(""+teamBScore);
                break;

            default:
                teamAScore=0;
                teamBScore=0;
                outA.setText(""+teamAScore);
                outB.setText(""+teamBScore);
        }
    }
}
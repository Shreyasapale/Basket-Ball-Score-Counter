package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int currentScoreA = 0 ;
    int currentScoreB = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incAThree (View view){
        currentScoreA = currentScoreA + 3 ;
        displayA();
    }

    public void incATwo (View view){
        currentScoreA = currentScoreA + 2 ;
        displayA();
    }

    public void incAOne (View view){
        currentScoreA = currentScoreA + 1 ;
        displayA();
    }

    private  void  displayA ( ){
        TextView scoreTextView = (TextView)findViewById(R.id.team_a_score);
        scoreTextView.setText(String.valueOf(currentScoreA));
    }

    public void incBThree (View view){
        currentScoreB = currentScoreB + 3 ;
        displayB();
    }

    public void incBTwo (View view){
        currentScoreB = currentScoreB + 2 ;
        displayB();
    }

    public void incBOne (View view){
        currentScoreB = currentScoreB + 1 ;
        displayB();
    }

    private  void  displayB ( ){
        TextView scoreTextView = (TextView)findViewById(R.id.team_b_score);
        scoreTextView.setText(String.valueOf(currentScoreB));
    }
    public  void  clearAB (View view){
        currentScoreA = 0 ;
        currentScoreB = 0 ;
        displayA();
        displayB();
    }
}
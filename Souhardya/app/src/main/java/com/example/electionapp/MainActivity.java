package com.example.electionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView winnerTestview;
    TextView voteA;
    TextView voteB;


    int votesOfA = 0;
    int votesOfB = 0;
    int totalVotes = 0;
    int nota = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        winnerTestview = findViewById(R.id.result_text_view);
        voteA = findViewById(R.id.button_3);
        voteB = findViewById(R.id.button_4);

    }


    public void voteforA(View v) {
        votesOfA++;
        totalVotes++;
        displayVotes();
        Toast.makeText(this, "Voted for A", Toast.LENGTH_SHORT).show();
    }

    public void voteforB(View v) {
        votesOfB++;
        totalVotes++;
        displayVotes();
        Toast.makeText(this, "Voted for B", Toast.LENGTH_SHORT).show();

    }



    public void votefornota(View v) {
        nota++;
        totalVotes++;
        displayVotes();
        Toast.makeText(this, "Voted on Nota", Toast.LENGTH_SHORT).show();

    }
    private void displayVotes(){
        voteA.setText(String.valueOf(votesOfA) + "/" + String.valueOf(totalVotes));
        voteB.setText(String.valueOf(votesOfB)+"/" + String.valueOf(totalVotes));

              if(votesOfA>votesOfB){
                  winnerTestview.setText("A is winning");
              }
              else if(votesOfB>votesOfA){
                  winnerTestview.setText("B is winning");
    }         else{
                  winnerTestview.setText("Tie");
              }
              }


    }

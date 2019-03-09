package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView winnerTextView;
    TextView voteA;
    TextView voteB;

    //declaring global variables to count votes
    int votesOfA=0;
    int votesOfB=0;
    int totalVotes=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        winnerTextView =findViewById(R.id.result_text_view);
        voteA=findViewById(R.id.party_a_vote);
        voteB=findViewById(R.id.party_b_vote);
    }

    public void voteForA(View view){

        votesOfA++;
        totalVotes++;
        voteA.setText(String.valueOf(votesOfA)+"/"+String.valueOf(totalVotes));
        voteB.setText(String.valueOf(votesOfB)+"/"+String.valueOf(totalVotes));
        Toast.makeText(this, "you have voted for A", Toast.LENGTH_SHORT).show();
        displayVotes();
    }
    public void voteForB(View view){
        votesOfB++;
        totalVotes++;
        voteA.setText(String.valueOf(votesOfA)+"/"+String.valueOf(totalVotes));
        voteB.setText(String.valueOf(votesOfB)+"/"+String.valueOf(totalVotes));
        Toast.makeText(this, "you have voted for B", Toast.LENGTH_SHORT).show();
        displayVotes();

    }

    public void voteForNone(View view){
        totalVotes++;

        voteA.setText(String.valueOf(votesOfA)+"/"+String.valueOf(totalVotes));
        voteB.setText(String.valueOf(votesOfB)+"/"+String.valueOf(totalVotes));
        Toast.makeText(this, "you have voted for none.", Toast.LENGTH_SHORT).show();
        displayVotes();
    }

    private void displayVotes(){

        voteA.setText(String.valueOf(votesOfA)+"/"+String.valueOf(totalVotes));
        voteB.setText(String.valueOf(votesOfB)+"/"+String.valueOf(totalVotes));

        if(votesOfA>votesOfB){
            winnerTextView.setText("A is Winning");
        }
        else if (votesOfB>votesOfA) {
            winnerTextView.setText("B is winning");
        }
        else{
            winnerTextView.setText("Tie");
        }

    }
}



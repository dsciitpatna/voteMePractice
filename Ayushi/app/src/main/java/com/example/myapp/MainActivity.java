package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView winnerTextView;
    TextView voteA;
    TextView voteB;
    int votesForA=0;
    int votesForB=0;
    int totalVotes=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        winnerTextView=findViewById(R.id.winner_text_view);
        voteA=findViewById(R.id.party_a_vote);
        voteB=findViewById(R.id.party_b_vote);

    }

    public void voteForA(View view){
        votesForA++;
        totalVotes++;
       displayVotes();
        Toast.makeText(this, "You have voted A", Toast.LENGTH_SHORT).show();
    }
    public void voteForB(View view){
        votesForB++;
        totalVotes++;
        displayVotes();
        Toast.makeText(this, "You have voted B", Toast.LENGTH_SHORT).show();

    }
    public void voteForNone(View view){
        totalVotes++;
        displayVotes();
        Toast.makeText(this, "You have voted None Of The Above ", Toast.LENGTH_SHORT).show();

    }
    private void displayVotes(){
        voteA.setText(String.valueOf(votesForA)+"/"+String.valueOf(totalVotes));
        voteB.setText(String.valueOf(votesForB)+"/"+String.valueOf(totalVotes));
        if(votesForA>votesForB){
            winnerTextView.setText("A is winning");
        }
        else if(votesForB>votesForA){
            winnerTextView.setText("B is winning");
        }
        else{
            winnerTextView.setText("Tie");
        }
    }
}

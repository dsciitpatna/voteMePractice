package com.example.votingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      TextView winnerTextView;
      TextView votea;
      TextView voteb;

      int votesOfa;
      int votesOfb;
      int totalVotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        winnerTextView=findViewById(R.id.result_text_view);
        votea=findViewById(R.id.party_a_vote);
        voteb=findViewById(R.id.party_b_vote);
    }
    public void VoteforA(View view) {
        votesOfa++;
        totalVotes++;
        displayVotes();

        Toast.makeText(this, "you have voted a", Toast.LENGTH_SHORT).show();
    }
    public void voteforb(View view) {
        votesOfb++;
        totalVotes++;
        displayVotes();

        Toast.makeText(this, "you have voted b", Toast.LENGTH_SHORT).show();
    }
    public void votefornone(View view){
        totalVotes++;
        displayVotes();

        Toast.makeText(this, "you have voted none", Toast.LENGTH_SHORT).show();
    }
    private void displayVotes(){
        votea.setText(String.valueOf(votesOfa)+"/"+String.valueOf(totalVotes));
        voteb.setText(String.valueOf(votesOfb)+"/"+String.valueOf(totalVotes));

        if(votesOfa>votesOfb){
            winnerTextView.setText("Ais winner");
        }
        else{
            winnerTextView.setText("B is winner");
        }
    }
}

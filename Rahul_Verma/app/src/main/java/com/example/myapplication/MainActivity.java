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

    int votesOfA = 0;
    int votesOfB = 0;
    int totalVotes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        winnerTextView = findViewById(R.id.result_text_view);
        voteA = findViewById(R.id.party_a_vote);
        voteB = findViewById(R.id.party_b_vote);

    }

    public void voteForA(View view) {
        votesOfA++;
        totalVotes++;
        //voteA.setText(String.valueOf(votesOfA) + "/" + String.valueOf(totalVotes));
        //voteB.setText(String.valueOf(votesOfB) + "/" + String.valueOf(totalVotes));
        displayVotes();
        Toast.makeText(this, "A is voted", Toast.LENGTH_SHORT).show();

    }

    public void voteForB(View view) {
        votesOfB++;
        totalVotes++;
        // voteB.setText(String.valueOf(votesOfB) + "/" + String.valueOf(totalVotes));
        //voteA.setText(String.valueOf(votesOfA) + "/" + String.valueOf(totalVotes));
        displayVotes();
        Toast.makeText(this, "B is voted ", Toast.LENGTH_SHORT).show();
    }

    public void voteForNone(View view) {
        totalVotes++;
        //voteA.setText(String.valueOf(votesOfA) + "/" + String.valueOf(totalVotes));
        //voteB.setText(String.valueOf(votesOfB) + "/" + String.valueOf(totalVotes));
        displayVotes();
        Toast.makeText(this, "NOTA is voted", Toast.LENGTH_SHORT).show();
    }
    public void clear(View view)
    {
        votesOfA = 0;
        votesOfB = 0;
        totalVotes = 0;
        displayVotes();
        winnerTextView.setText("");
    }
    private void displayVotes(){
        voteA.setText(String.valueOf(votesOfA) + "/" + String.valueOf(totalVotes));
        voteB.setText(String.valueOf(votesOfB) + "/" + String.valueOf(totalVotes));

        if(votesOfA > votesOfB)
        {
            winnerTextView.setText("A is winner");

        }
        else if(votesOfA < votesOfB)
        {  winnerTextView.setText("B is winner");
        }

        else{
            winnerTextView.setText("Tie");
        }
    }



}


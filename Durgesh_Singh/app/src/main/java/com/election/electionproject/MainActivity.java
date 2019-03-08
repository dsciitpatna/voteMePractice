package com.election.electionproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView winnerTextView;
    TextView voteA;
    TextView voteB;
    int voteofA = 0;
    int voteofB = 0;
    int totalvotes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        winnerTextView = findViewById(R.id.result_text_view);
        voteA = findViewById(R.id.party_a_vote);
        voteB = findViewById(R.id.party_b_vote);

    }

    public void voteforA(View v) {
        voteofA++;
        totalvotes++;
        displayVotes();
        Toast.makeText(this, "You have voted A", Toast.LENGTH_SHORT).show();
    }

    public void voteforB(View v) {
        voteofB++;
        totalvotes++;
        displayVotes();
        Toast.makeText(this, "You have voted B", Toast.LENGTH_SHORT).show();
    }


    public void votefornone(View v) {
        totalvotes++;
        displayVotes();
        Toast.makeText(this, "You ha e", Toast.LENGTH_SHORT).show();

    }
    private void displayVotes()
    {
        voteB.setText(String.valueOf(voteofB) + "/" + String.valueOf(totalvotes));
        voteA.setText(String.valueOf(voteofA) + "/" + String.valueOf(totalvotes));
        if(voteofA>voteofB)
        {
            winnerTextView.setText("A is winning");
        }
        else if(voteofB>voteofA)
        {
            winnerTextView.setText("B is winning");
        }
        else
        {
            winnerTextView.setText("its a tie");
        }
    }
}


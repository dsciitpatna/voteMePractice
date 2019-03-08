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

    int voteOfA=0;
    int voteOfB=0;
    int totalvotes=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    winnerTextView = findViewById(R.id.result_text_view);
    voteA = findViewById(R.id.party_a_vote);
    voteB = findViewById(R.id.party_b_vote);

    }


    public void VoteforA(View v)
    {
        voteOfA++;
        totalvotes++;
        voteA.setText(String.valueOf(voteOfA+"/"+String.valueOf(totalvotes)));
        voteA.setText(String.valueOf(voteOfB+"/"+String.valueOf(totalvotes)));
        if(voteOfA > voteOfB)
            winnerTextView.setText("A is winner");
        else if(voteOfB>voteOfA)
            winnerTextView.setText("B is winner");
        else
            winnerTextView.setText("Tie");
        Toast.makeText(MainActivity.this, "You have Voted for A", Toast.LENGTH_SHORT).show();

    }
    public void VoteforB(View v)
    {
        voteOfB++;
        totalvotes++;
        voteB.setText(String.valueOf(voteOfB)+"/"+String.valueOf(totalvotes));
        voteA.setText(String.valueOf(voteOfA+"/"+String.valueOf(totalvotes)));
        if(voteOfA>voteOfB)
            winnerTextView.setText("A is winner");
        else if(voteOfB>voteOfA)
            winnerTextView.setText("B is winner");
        else
            winnerTextView.setText("Tie");
        Toast.makeText(MainActivity.this, "You have Voted for B", Toast.LENGTH_SHORT).show();
    }
    public void Votefornone()
    {
        totalvotes++;
        voteB.setText(String.valueOf(voteOfB)+"/"+String.valueOf(totalvotes));
        voteA.setText(String.valueOf(voteOfA+"/"+String.valueOf(totalvotes)));
        if(voteOfA>voteOfB)
            winnerTextView.setText("A is winner");
        else if(voteOfB>voteOfA)
            winnerTextView.setText("B is winner");
        else
            winnerTextView.setText("Tie");
        Toast.makeText(MainActivity.this, "You have Voted for None", Toast.LENGTH_SHORT).show();
    }


}

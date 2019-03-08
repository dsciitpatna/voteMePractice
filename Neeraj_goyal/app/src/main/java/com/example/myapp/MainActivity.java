package com.example.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView winnerTextview; /* winnertextview is avariable name */
    TextView voteA;
    TextView voteB;

    int voteOfA=0;
    int voteOfB=0;
    int total=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        winnerTextview = findViewById(R.id.result_text_view);
        voteA = findViewById(R.id.party_vote_a);
        voteB = findViewById(R.id.party_vote_b);


    }

    public void voteforA(View view)  /*v is a variable name */{
        voteOfA++;
        total++;
        displayvotes();
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        

    }
    public void voteforB(View v){
        voteOfB++;
        total++;
        displayvotes();
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
public void votefornota(View v){
        total++;

    displayvotes();

}
private void displayvotes(){
    voteA.setText(String.valueOf(voteOfA)+"/"+String.valueOf(total));
    voteB.setText(String.valueOf(voteOfB)+"/"+String.valueOf(total));
if(voteOfA>voteOfB)
    winnerTextview.setText("A is winner");
if(voteOfB>voteOfA)
    winnerTextview.setText("B is winner");
if(voteOfA==voteOfB)
    winnerTextview.setText("Tie");


}
}

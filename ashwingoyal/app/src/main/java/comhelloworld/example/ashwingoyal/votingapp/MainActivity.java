package comhelloworld.example.ashwingoyal.votingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView winnertextview;
    TextView vote_A;
    TextView vote_M;

    int VotesOfA=0;
    int VotesOfM=0;
    int TotalVotes=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        winnertextview = findViewById(R.id.Winner);
        vote_A = findViewById(R.id.Vote_A);
        vote_M = findViewById(R.id.Vote_M);
    }


    public void VoteForA(View v)
    {
        VotesOfA++;
        TotalVotes++;
        displayvotes();
        Toast.makeText(this, "You Voted Atul", Toast.LENGTH_SHORT).show();
    }

    public void VoteForM(View v)
    {
        VotesOfM++;
        TotalVotes++;
        displayvotes();
        Toast.makeText(this, "You Voted Maurya", Toast.LENGTH_SHORT).show();
    }

    public void VoteForNone(View v)
    {
        TotalVotes++;
        displayvotes();
        Toast.makeText(this, "You Voted None", Toast.LENGTH_SHORT).show();
    }

    private void displayvotes()
    {
        vote_A.setText(String.valueOf(VotesOfA)+"/"+String.valueOf(TotalVotes));
        vote_M.setText(String.valueOf(VotesOfM)+"/"+String.valueOf(TotalVotes));

        if(VotesOfA > VotesOfM)
        {
            winnertextview.setText("Atul is winning");
        }
        else
        {
            if(VotesOfM > VotesOfA)
            {
                winnertextview.setText("Maurya is winning");
            }
            else
            {
                winnertextview.setText("Still PSR");
            }
        }
    }


}

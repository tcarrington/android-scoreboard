package tournament.brackets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Taylor on 10/17/13.
 */
public class SoccerActivity extends Activity {

    MatchInformation soccerInformation = new MatchInformation();

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soccer);

        Intent intent = getIntent();
        soccerInformation.team1Name = intent.getStringExtra("TEAM_1");
        soccerInformation.team2Name = intent.getStringExtra("TEAM_2");
        soccerInformation.matchName = intent.getStringExtra("MATCH_NAME");



        TextView team1Name = (TextView) findViewById(R.id.team_1_name);
        TextView team2Name = (TextView) findViewById(R.id.team_2_name);
        TextView matchName = (TextView) findViewById(R.id.match_name);

        team1Name.setText(soccerInformation.team1Name);
        team2Name.setText(soccerInformation.team2Name);
        matchName.setText(soccerInformation.matchName);


    }

    //Score Increment
    public void team1ScoreIncrement(View view){
        soccerInformation.addPoint(1, soccerInformation.team1);
        TextView textView =  (TextView) findViewById(R.id.team_1_score);
        textView.setText(String.valueOf(soccerInformation.team1Score));
    }

    public void team2ScoreIncrement(View view){
        soccerInformation.addPoint(1, soccerInformation.team2);
        TextView textView =  (TextView) findViewById(R.id.team_2_score);
        textView.setText(String.valueOf(soccerInformation.team2Score));
    }

    //Score Decrement
    public void team1ScoreDecrement(View view){
        soccerInformation.subPoint(1, soccerInformation.team1);
        TextView textView =  (TextView) findViewById(R.id.team_1_score);
        textView.setText(String.valueOf(soccerInformation.team1Score));
    }

    public void team2ScoreDecrement(View view){
        soccerInformation.subPoint(1, soccerInformation.team2);
        TextView textView =  (TextView) findViewById(R.id.team_2_score);
        textView.setText(String.valueOf(soccerInformation.team2Score));
    }

    //Shots Increment
    public void team1ShotsIncrement(View view){
        soccerInformation.addShot(1, soccerInformation.team1);
        TextView textView =  (TextView) findViewById(R.id.team_1_shots);
        textView.setText(String.valueOf(soccerInformation.team1Shots));
    }

    public void team2ShotsIncrement(View view){
        soccerInformation.addShot(1, soccerInformation.team2);
        TextView textView =  (TextView) findViewById(R.id.team_2_shots);
        textView.setText(String.valueOf(soccerInformation.team2Shots));
    }

    //Shots Decrement
    public void team1ShotsDecrement(View view){
        soccerInformation.subShot(1, soccerInformation.team1);
        TextView textView =  (TextView) findViewById(R.id.team_1_shots);
        textView.setText(String.valueOf(soccerInformation.team1Shots));
    }

    public void team2ShotsDecrement(View view){
        soccerInformation.subShot(1, soccerInformation.team2);
        TextView textView =  (TextView) findViewById(R.id.team_2_shots);
        textView.setText(String.valueOf(soccerInformation.team2Shots));
    }


    //Saves Increment
    public void team1SavesIncrement(View view){
        soccerInformation.addSave(1, soccerInformation.team1);
        TextView textView =  (TextView) findViewById(R.id.team_1_saves);
        textView.setText(String.valueOf(soccerInformation.team1Saves));
    }

    public void team2SavesIncrement(View view){
        soccerInformation.addSave(1, soccerInformation.team2);
        TextView textView =  (TextView) findViewById(R.id.team_2_saves);
        textView.setText(String.valueOf(soccerInformation.team2Saves));
    }

    //Saves Decrement
    public void team1SavesDecrement(View view){
        soccerInformation.subSave(1, soccerInformation.team1);
        TextView textView =  (TextView) findViewById(R.id.team_1_saves);
        textView.setText(String.valueOf(soccerInformation.team1Saves));
    }

    public void team2SavesDecrement(View view){
        soccerInformation.subSave(1, soccerInformation.team2);
        TextView textView =  (TextView) findViewById(R.id.team_2_saves);
        textView.setText(String.valueOf(soccerInformation.team2Saves));
    }

}
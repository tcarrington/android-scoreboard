package tournament.brackets;

import android.app.Activity;
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
    }


    public void team1ScoreIncrement(View view){
        soccerInformation.addPoint(1, soccerInformation.team1);
        TextView textView =  (TextView) findViewById(R.id.team_1_score);
        textView.setText(String.valueOf(soccerInformation.getTeam1Score()));
    }

    public void team2ScoreIncrement(View view){
        soccerInformation.addPoint(1, soccerInformation.team2);
        TextView textView =  (TextView) findViewById(R.id.team_2_score);
        textView.setText(String.valueOf(soccerInformation.getTeam2Score()));
    }

    public void team1ScoreDecrement(View view){
        soccerInformation.subPoint(1, soccerInformation.team1);
        TextView textView =  (TextView) findViewById(R.id.team_1_score);
        textView.setText(String.valueOf(soccerInformation.getTeam1Score()));
    }

    public void team2ScoreDecrement(View view){
        soccerInformation.subPoint(1, soccerInformation.team2);
        TextView textView =  (TextView) findViewById(R.id.team_2_score);
        textView.setText(String.valueOf(soccerInformation.getTeam2Score()));
    }

}
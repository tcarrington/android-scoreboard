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
        soccerInformation.addPoint(1);
        int score = soccerInformation.getTeam1Score();
        TextView textView =  (TextView) findViewById(R.id.team_1_score);
        textView.setText(String.valueOf(score));
    }

}
package tournament.brackets;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Taylor on 10/17/13.
 */
public class SoccerActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MatchInformation matchInformation = new MatchInformation();
        setContentView(R.layout.activity_soccer);
    }


    public void team1ScoreIncrement(View view){

    }
}
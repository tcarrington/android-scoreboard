package tournament.brackets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Taylor on 9/27/13.
 */
public class QuickMatchSBActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String matchType = bundle.getString("MATCH_TYPE");
        int totalPlayers = bundle.getInt("NUMBER_OF_PLAYERS");

        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(totalPlayers);
        //save data to local database and achive, create link to game on match history page
        //dynamically update match history page, need sort by color
        setContentView(textView);
    }

    //need to dynamically build environment based on # of players and match type
    //will need a timer and start/stop times for most game types

}


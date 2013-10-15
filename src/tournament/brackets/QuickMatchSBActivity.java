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

        //Intent intent = getIntent();
        //Bundle bundle = intent.getExtras();
        //int totalPlayers = bundle.getInt("NUMBER_OF_PLAYERS");
        String matchType = getIntent().getStringExtra("MATCH_TYPE");
        int totalPlayers = getIntent().getIntExtra("NUMBER_OF_PLAYERS", 1);

        TextView textViewMatch = new TextView(this);
        TextView textViewPlayers = new TextView(this);
        textViewMatch.setTextSize(40);
        textViewPlayers.setTextSize(40);
        textViewMatch.setText(matchType);
        textViewPlayers.setText(String.valueOf(totalPlayers));
        //save data to local database and archive, create link to game on match history page
        //dynamically update match history page, need sort by color
        setContentView(textViewMatch);
        setContentView(textViewPlayers);
    }

    //need to dynamically build environment based on # of players and match type
    //will need a timer and start/stop times for most game types

    //first match type = soccer

}


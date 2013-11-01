package tournament.brackets;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.ArrayList;


public class QuickMatchActivity extends ListActivity {
    ArrayList<String> team1PlayerList = new ArrayList<String>();
    ArrayList<String> team2PlayerList = new ArrayList<String>();

    ArrayAdapter<String> adapter1;
    ArrayAdapter<String> adapter2;

    int totalPlayers = 0;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_match);
        adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, team1PlayerList);
        adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2, team2PlayerList);
        //first list adapter visible via setListAdapter(adapter1)
        //will need to set adapter2 visible when clicked (onclick button)
        setListAdapter(adapter1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.create_tournament_settings, menu);
        return true;
    }

    //add players to list (dynamic)
    public void addPlayerItems(View view) {
        String playerName = ((EditText)findViewById(R.id.team_name_input)).getText().toString();
        //teamListItems.add(playerName + " " + ++totalPlayers);
        //adapter.notifyDataSetChanged();
        ((EditText) findViewById(R.id.team_name_input)).setText("");
    }

    public void startMatch(View view) {
        Intent intent = new Intent(this, SoccerActivity.class);
        String matchName = ((EditText)findViewById(R.id.match_name_input)).getText().toString();
        //String team1 = teamListItems.get(0);
        //String team2 = teamListItems.get(1);
        //intent.putExtra("TEAM_1", team1);
        //intent.putExtra("TEAM_2", team2);
        intent.putExtra("MATCH_NAME", matchName);
        startActivity(intent);
    }
}
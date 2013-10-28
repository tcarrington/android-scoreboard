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
    ArrayList<String> teamListItems = new ArrayList<String>();

    ArrayAdapter<String> adapter;

    int totalPlayers = 0;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_match);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, teamListItems);
        setListAdapter(adapter);
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
        teamListItems.add(playerName + " " + ++totalPlayers);
        adapter.notifyDataSetChanged();
        ((EditText) findViewById(R.id.team_name_input)).setText("");
    }

    public void startMatch(View view) {
        Intent intent = new Intent(this, SoccerActivity.class);
        String team1 = teamListItems.get(0);
        String team2 = teamListItems.get(1);
        intent.putExtra("TEAM_1", team1);
        intent.putExtra("TEAM_2", team2);
        startActivity(intent);
    }
}
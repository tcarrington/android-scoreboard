package tournament.brackets;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;


public class QuickMatchActivity extends ListActivity {
    ArrayList<String> playerListItems = new ArrayList<String>();

    ArrayAdapter<String> adapter;

    int totalPlayers = 0;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_match);
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, playerListItems);
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
        String playerName = ((EditText)findViewById(R.id.playernameinput)).getText().toString();
        playerListItems.add(playerName + " " + ++totalPlayers);
        adapter.notifyDataSetChanged();
        ((EditText) findViewById(R.id.playernameinput)).setText("");
    }

    //create match. save and push data to target activity (QuickMatchSBActivity.java)
    public void startMatch(View view) {
        Intent intent = new Intent(this, QuickMatchSBActivity.class);
        //Bundle bundle = new Bundle();
        String matchType = ((Spinner) findViewById(R.id.spinner)).getSelectedItem().toString();
/*
        bundle.putInt("NUMBER_OF_PLAYERS", totalPlayers);
        bundle.putString("MATCH_TYPE", matchType);
        bundle.putStringArrayList("LIST_OF_PLAYERS", playerListItems);
        intent.putExtra("BUNDLE_INFO", bundle);*/
        intent.putExtra("MATCH_TYPE", matchType);
        intent.putExtra("NUMBER_OF_PLAYERS", totalPlayers);
        intent.putExtra("LIST_OF_PLAYERS", playerListItems);
        startActivity(intent);
    }
}
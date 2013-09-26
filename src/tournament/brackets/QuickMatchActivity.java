package tournament.brackets;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.ArrayList;


public class QuickMatchActivity extends ListActivity {
    ArrayList<String> playerListItems = new ArrayList<String>();

    ArrayAdapter<String> adapter;

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

    public void addPlayerItems(View view) {
        String playerName = ((EditText)findViewById(R.id.playernameinput)).getText().toString();
        playerListItems.add(playerName);
        adapter.notifyDataSetChanged();
        ((EditText) findViewById(R.id.playernameinput)).setText("");
    }
}
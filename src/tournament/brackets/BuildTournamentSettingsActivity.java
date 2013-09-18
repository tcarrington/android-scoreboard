package tournament.brackets;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

public class BuildTournamentSettingsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_build_tournament_settings);

	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.create_tournament_settings, menu);
		return true;
	}

	

}

package boys.bachmair.pickupgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JoinGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_game);

        //Get the game object being passed from the map
        Bundle bundle = getIntent().getExtras();
        Game game = bundle.getParcelable("boys.bachmair.pickupgame.Game");

        TextView name_textView = (TextView) findViewById(R.id.game_name);
        name_textView.setText(game.name);

        TextView host_textView = (TextView) findViewById(R.id.game_host);
        host_textView.setText("Hosted by: " + game.host);

        TextView expiry_textView = (TextView) findViewById(R.id.game_end_time);
        expiry_textView.setText("Game ends at: " + game.until);

    }
}

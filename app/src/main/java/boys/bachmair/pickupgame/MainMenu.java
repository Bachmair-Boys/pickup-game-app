package boys.bachmair.pickupgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);
    }

    public void startGame(View view) {
        Intent intent = new Intent(this, StartGame.class);
        startActivity(intent);
    }

    public void findGames(View view) {
        Intent intent = new Intent(this, MapActivity.class);
        startActivity(intent);
    }
}

package boys.bachmair.pickupgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Login button */
    public void loginScreen(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    /** Called when the user taps the Sign Up button */
    public void signupScreen(View view) {
        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}

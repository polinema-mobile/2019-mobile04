package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileBundleActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

//        String value, name, age;
        Bundle extras = getIntent().getExtras();
        if (extras != null){
            // TODO: display value here
            String username = getIntent().getStringExtra("USERNAME_KEY");
            usernameText.setText(username);
            String name = getIntent().getStringExtra("NAME_KEY");
            nameText.setText(name);
            ageText.setText(String.valueOf(extras.getInt("AGE_KEY")));
        }
    }
}

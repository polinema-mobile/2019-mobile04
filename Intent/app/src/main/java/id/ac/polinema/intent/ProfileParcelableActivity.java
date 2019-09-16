package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import model.User;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText= findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        Intent intent = getIntent();
        User parcel = intent.getParcelableExtra("user");

        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            // TODO: display value here
            String username = parcel.getUsername();
            String name = parcel.getName();
//            int age = Integer.parseInt(ageText.getText().toString());

            usernameText.setText(username);
            nameText.setText(name);
//            ageText.setText(String.valueOf(extras.getInt(age)));
        }
    }
}

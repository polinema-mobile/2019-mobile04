package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class BundleActivity extends AppCompatActivity {

    public  static final  String USERNAME_KEY = "username";
    public  static final  String NAME_KEY = "name";
    public  static final  String AGE_KEY = "age";

    private  EditText input_username;
    private  EditText input_name;
    private  EditText input_age;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle);
        input_username = findViewById(R.id.input_username);
        input_name = findViewById(R.id.input_name);
        input_age = findViewById(R.id.input_age);
    }


    public void handleSubmit(View view) {
        String username =input_username.getText().toString();
        String name = input_name.getText().toString();
        int age = Integer.parseInt(input_age.getText().toString());
        Intent intent = new Intent(this, ProfileBundleActivity.class);
        intent.putExtra(USERNAME_KEY, username);
        intent.putExtra(NAME_KEY, name);
        intent.putExtra(AGE_KEY, age);
        startActivity(intent);
    }
}

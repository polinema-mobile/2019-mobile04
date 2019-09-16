package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ExplicitIntentActivity extends AppCompatActivity {
    private EditText input_name;
    private TextView text_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        input_name = findViewById(R.id.input_name);
        text_output = findViewById(R.id.text_output);
    }

    public void handleSubmit(View view) {
        String name = input_name.getText().toString();
        text_output.setText(name);
    }
}

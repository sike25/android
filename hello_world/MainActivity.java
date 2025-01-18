package com.example.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this is what connects the android layout to code to our java program
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.text);

        //User can change the color of the text
        findViewById(R.id.button).setOnClickListener(view -> textView.setTextColor(getResources().getColor(R.color.onlineOrange)));

        //User can change the background color
        findViewById(R.id.button2).setOnClickListener(view -> findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.white)));

        //User can change the text
        findViewById(R.id.button3).setOnClickListener(view -> textView.setText("Android is Awesome!"));

        //User can change all elements to their default settings
        findViewById(R.id.parent).setOnClickListener(view -> {
            textView.setText("Hello from Sike!");
            textView.setTextColor(getResources().getColor(R.color.lightBlue));
            findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.purple));
        });

        //User can transfer custom text
        findViewById(R.id.button4).setOnClickListener(view -> {
            String custom = ((EditText)findViewById(R.id.editText)).getText().toString();
            if (custom.isEmpty()) {
                textView.setText("Change text to YOUR custom text");
            }
           else {
                textView.setText(custom);
            }
        });
    }
}
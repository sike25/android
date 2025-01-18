package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddCardActivity extends AppCompatActivity {

    @SuppressWarnings("all")
    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_card);

      //Cancel button listener
        findViewById(R.id.cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddCardActivity.this, MainActivity.class);
                AddCardActivity.this.startActivity(intent);
                finish();
            }
        });
      
        //Save button listener
        findViewById(R.id.save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Saving the user inputs into string variables
                String customQ = ((EditText)findViewById(R.id.que)).getText().toString();
                String customA = ((EditText)findViewById(R.id.ans)).getText().toString();

                Intent intent = new Intent(AddCardActivity.this, MainActivity.class);
                intent.putExtra("customQ", customQ);
                intent.putExtra("customA", customA);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}

package com.example.catch226;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LaunchPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_page);

        Toast.makeText(this, "Nudge the boy to launch our stories", Toast.LENGTH_LONG).show();

        findViewById(R.id.readanim).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LaunchPage.this, com.example.catch226.Menu.class);
                LaunchPage.this.startActivity(intent);
                finish();
            }
        });
    }
}
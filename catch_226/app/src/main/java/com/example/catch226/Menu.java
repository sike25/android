package com.example.catch226;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.catch226.databinding.ActivityMenuBinding;

public class Menu extends AppCompatActivity {

    private ActivityMenuBinding binding;

    @Override
    @RequiresApi(api = Build.VERSION_CODES.M)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_menu);

        findViewById(R.id.Alex).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.alexT);
                String story = getString(R.string.alexS);

                findViewById(R.id.Alex).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("story2", "");
                intent.putExtra("code", 0);

                Menu.this.startActivity(intent);
            }
        });

        findViewById(R.id.Ally).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.allyT);
                String story = getString(R.string.allyS);

                findViewById(R.id.Ally).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("story2", "");
                intent.putExtra("code", 0);

                Menu.this.startActivity(intent);
            }
        });

        findViewById(R.id.Cristian).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.cristianT);
                String story = getString(R.string.cristianS);

                findViewById(R.id.Cristian).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("story2", "");
                intent.putExtra("code", 0);

                Menu.this.startActivity(intent);

            }
        });

        findViewById(R.id.Davis).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.davisT);
                String story = getString(R.string.davisS);

                findViewById(R.id.Davis).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("code", 0);
                intent.putExtra("story2", "");

                Menu.this.startActivity(intent);
            }
        });

        findViewById(R.id.Eleanor).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.eleanorT);
                String story = getString(R.string.eleanorS);

                findViewById(R.id.Eleanor).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("code", 0);
                intent.putExtra("story2", "");

                Menu.this.startActivity(intent);
            }
        });

        findViewById(R.id.Maryam).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.maryamT);
                String story = getString(R.string.maryamS);

                findViewById(R.id.Maryam).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("story2", "");
                intent.putExtra("code", 0);

                Menu.this.startActivity(intent);
            }
        });

        findViewById(R.id.Matthew).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.matthewT);
                String story = getString(R.string.matthewS);

                findViewById(R.id.Matthew).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("story2", "");
                intent.putExtra("code", 0);

                Menu.this.startActivity(intent);
            }
        });

        findViewById(R.id.Nora).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.noraT);
                String story = getString(R.string.noraS);

                findViewById(R.id.Nora).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("story2", "");
                intent.putExtra("code", 0);

                Menu.this.startActivity(intent);
            }
        });

        findViewById(R.id.Rebecca).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.rebeccaT);
                String story = getString(R.string.rebeccaS);
                String story2 = getString(R.string.rebeccaS2);

                findViewById(R.id.Rebecca).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("story2", story2);
                intent.putExtra("code", 0);

                Menu.this.startActivity(intent);
            }
        });

        findViewById(R.id.Sarah).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.sarahT);
                String story = getString(R.string.sarahS);
                String story2 = getString(R.string.sarahS2);

                findViewById(R.id.Sarah).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("story2", story2);
                intent.putExtra("code", 0);

                Menu.this.startActivity(intent);
            }
        });

        findViewById(R.id.Sike).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.sikeT);
                String story = getString(R.string.sikeS);
                String story2 = " ";

                findViewById(R.id.Sarah).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("story2", story2);
                intent.putExtra("code", 0);

                Menu.this.startActivity(intent);
            }
        });

        findViewById(R.id.Steven).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.stevenT);
                String story = getString(R.string.stevenS);

                findViewById(R.id.Steven).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("story2", "");
                intent.putExtra("code", 0);

                Menu.this.startActivity(intent);
            }
        });

        findViewById(R.id.Sydney).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.sydneyT);
                String story = getString(R.string.sydneyS);
                String story2 = getString(R.string.sydneyS2);

                findViewById(R.id.Sydney).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("story2", story2);
                intent.putExtra("code", 0);

                Menu.this.startActivity(intent);
            }
        });

        findViewById(R.id.Taku).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.takuT);
                String story = getString(R.string.takuS);
                String story2 = getString(R.string.takuS2);

                findViewById(R.id.Taku).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("story2", story2);
                intent.putExtra("code", 0);

                Menu.this.startActivity(intent);
            }
        });

        findViewById(R.id.Wenche).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = getString(R.string.wencheT);
                String story = getString(R.string.wencheS);
                String story2 = getString(R.string.wencheS2);

                findViewById(R.id.Wenche).setBackgroundColor(getResources().getColor(R.color.gray, null));
                Intent intent = new Intent(Menu.this, com.example.catch226.ScrollingActivity.class);

                intent.putExtra("title", title);
                intent.putExtra("story", story);
                intent.putExtra("story2", story2);
                intent.putExtra("code", 0);

                Menu.this.startActivity(intent);
            }
        });
    }
}



// Toast.makeText(this, "Message saved as draft.", Toast.LENGTH_SHORT).show();

//        binding = ActivityMenuBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());

//        Toolbar toolbar = binding.toolbar;
//        setSupportActionBar(toolbar);
//        CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout;
//        toolBarLayout.setTitle(getTitle());
//
//        FloatingActionButton fab = binding.fab;
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
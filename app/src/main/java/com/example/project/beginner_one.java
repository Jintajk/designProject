package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.project.lang_selection.MY_PREFS_NAME;


public class beginner_one extends AppCompatActivity {

    ImageButton imgsettings;

    TextView t1;

    Button b1;

    String language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beginner_one);

        SharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE);

        language = prefs.getString("langchoosen", null);

        t1 = (TextView) findViewById(R.id.beginnerlanguage);

        b1 = (Button) findViewById(R.id.basics1);

        t1.setText(language);

        imgsettings = findViewById(R.id.iconsettings);

        imgsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner_one.this, settings.class);
                startActivity(intent);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(beginner_one.this,basics1.class);
                startActivity(intent);
            }
        });

    }
}

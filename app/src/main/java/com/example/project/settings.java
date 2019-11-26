package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class settings extends AppCompatActivity implements View.OnClickListener {

    Button abt;
    Button lgout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        abt = (Button) findViewById(R.id.about);
        lgout = (Button) findViewById(R.id.Logout);

        abt.setOnClickListener(this);
        lgout.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view == abt)
        {
            startActivity(new Intent(settings.this,About.class));
        }

        if (view == lgout)
        {
            startActivity(new Intent(settings.this,loginpage.class));
        }
    }
}

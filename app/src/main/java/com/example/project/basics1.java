package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class basics1 extends AppCompatActivity {

    RelativeLayout boy;
    RelativeLayout girl;
    RelativeLayout woman;
    RelativeLayout man;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basics1);

        boy = (RelativeLayout) findViewById(R.id.boyq1);
        girl = (RelativeLayout) findViewById(R.id.girlq1);
        woman = (RelativeLayout) findViewById(R.id.womanq1);
        man = (RelativeLayout) findViewById(R.id.manq1);

        boy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(v.this,"WELL DONE!!",Toast.LENGTH_SHORT).show();
            }
        });

        girl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display WELL DONE
            }
        });

        man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display WELL DONE
            }
        });

        woman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display WELL DONE
            }
        });

    }
}

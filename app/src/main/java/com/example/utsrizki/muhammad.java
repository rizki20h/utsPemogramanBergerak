package com.example.utsrizki;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class muhammad extends AppCompatActivity {
    Button btnNextMuhammad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muhammad);
        btnNextMuhammad = findViewById(R.id.nextMuhammad);
        btnNextMuhammad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(muhammad.this, muhammadnext.class));
            }
        });
    }
}
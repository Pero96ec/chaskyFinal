package com.chasky.chaskyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button mButtonIAmClient;
    Button mButtonIAmDriver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonIAmClient = findViewById(R.id.btnIAmClient);
        mButtonIAmDriver = findViewById(R.id.btnIAmDriver);

        mButtonIAmClient.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                goToSelectAuth();
            }
        });

        mButtonIAmDriver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                goToSelectAuth();
            }
        });
    }

    private void goToSelectAuth() {
        Intent intent = new Intent( MainActivity.this, SelectOptionAuthActivity.class);
        startActivity(intent);
    }
}
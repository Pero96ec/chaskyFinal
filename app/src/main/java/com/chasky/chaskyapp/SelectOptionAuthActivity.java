package com.chasky.chaskyapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SelectOptionAuthActivity extends AppCompatActivity {

    Toolbar mToolbar;
    Button mButtonGoToLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_option_auth);
        mToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Seleccionar opcion");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mButtonGoToLogin = findViewById(R.id.btnGoToLogin);
        mButtonGoToLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                goToLogin();
            }
        });

    }

    public void goToLogin() {
        Intent intent = new Intent(SelectOptionAuthActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
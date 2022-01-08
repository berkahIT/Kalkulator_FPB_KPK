package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }
    private void inisialisasiView() {
        profile = findViewById(R.id.profile);
        profile.setOnClickListener(view -> bukaProfileActivity());
    }

    private void bukaProfileActivity() {
        Log.d("MAIN","Buka activity profile");
        Intent intent = new Intent(this,Profile.class);
        startActivity(intent);
    }
}
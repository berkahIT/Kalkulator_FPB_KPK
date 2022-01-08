package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class Profile extends AppCompatActivity {
    Button menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        inisialisasView();
    }
    private void  inisialisasView(){
        menu = findViewById(R.id.menu);
        menu.setOnClickListener(view -> bukaMainActivity());
    }
    private void bukaMainActivity(){
        Log.d("MAIN","Buka activity profile");
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
package com.example.planets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.io.Serializable;

public class PlanetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet);

        Intent intent = getIntent();
        Planet planet = (Planet) intent.getSerializableExtra("planet");
        Toast.makeText(PlanetActivity.this, planet.toString(), Toast.LENGTH_SHORT).show();
    }
}
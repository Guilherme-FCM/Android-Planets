package com.example.planets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class PlanetActivity extends AppCompatActivity {
    private ImageView planetImageView;
    private TextView planetNameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet);

        planetImageView = findViewById(R.id.planetImage);
        planetNameView = findViewById(R.id.planetName);

        Intent intent = getIntent();
        Planet planet = (Planet) intent.getSerializableExtra("planet");

        planetImageView.setImageResource(planet.getImage());
        planetNameView.setText(planet.getName());
    }
}
package com.example.planets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class PlanetActivity extends AppCompatActivity {
    private ImageView planetImageView;
    private TextView planetNameView;
    private ListView planetCuriosities;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planet);

        planetImageView = findViewById(R.id.planetImage);
        planetNameView = findViewById(R.id.planetName);
        planetCuriosities = findViewById(R.id.planetCuriosities);

        Intent intent = getIntent();
        Planet planet = (Planet) intent.getSerializableExtra("planet");

        planetImageView.setImageResource(planet.getImage());
        planetNameView.setText(planet.getName());

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, planet.getCuriosities());
        planetCuriosities.setAdapter(adapter);
    }
}
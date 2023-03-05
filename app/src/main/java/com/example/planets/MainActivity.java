package com.example.planets;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private ArrayList<Planet> data;
    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        fillData();
        fillArrayAdapter();
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    private void fillArrayAdapter() {
        adapter = new MyAdapter(this, data);
    }

    private void fillData() {
        data = new ArrayList<Planet>();
        String[] planets = getResources().getStringArray(R.array.planets);
        TypedArray images = getResources().obtainTypedArray(R.array.planet_images);
        for (int i = 0; i < planets.length; i++) {
            String planet = planets[i];
            int image = images.getResourceId(i, 0);
            data.add(new Planet(planet, image));
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Planet item = (Planet) adapterView.getItemAtPosition(i);
        Toast.makeText(this, "Planeta selecionado: " + item, Toast.LENGTH_SHORT).show();
    }
}
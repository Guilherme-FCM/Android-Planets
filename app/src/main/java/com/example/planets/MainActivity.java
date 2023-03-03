package com.example.planets;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private ArrayList<ListItem> data;
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
        data = new ArrayList<ListItem>();
        data.add(new ListItem("Item 1", R.drawable.ic_launcher_background));
        data.add(new ListItem("Item 2", R.drawable.ic_launcher_background));
        data.add(new ListItem("Item 3", R.drawable.ic_launcher_background));
        data.add(new ListItem("Item 4", R.drawable.ic_launcher_background));
        data.add(new ListItem("Item 5", R.drawable.ic_launcher_background));
        data.add(new ListItem("Item 6", R.drawable.ic_launcher_background));
        data.add(new ListItem("Item 7", R.drawable.ic_launcher_background));
        data.add(new ListItem("Item 8", R.drawable.ic_launcher_background));
        data.add(new ListItem("Item 9", R.drawable.ic_launcher_background));
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        ListItem item = (ListItem) adapterView.getItemAtPosition(i);
        Toast.makeText(this, "Click em: " + item, Toast.LENGTH_SHORT).show();
    }
}
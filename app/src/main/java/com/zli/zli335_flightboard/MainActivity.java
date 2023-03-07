package com.zli.zli335_flightboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flight_search);

    }

    public void onButtonClick(View view) {
        EditText searchBar = findViewById(R.id.search_bar);

        String searchQuery = searchBar.getText().toString();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("searchQuery", searchQuery);
        startActivity(intent);

        setContentView(R.layout.flight_search);
    }

}
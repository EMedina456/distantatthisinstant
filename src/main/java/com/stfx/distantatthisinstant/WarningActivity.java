package com.stfx.distantatthisinstant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class WarningActivity extends AppCompatActivity {

    // Generate warning page
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warning);
    }

    // When the user views the spinner...
    public void onClickBtn(View view) {
        Spinner cities = findViewById(R.id.spinner);
        String cityName = cities.getSelectedItem().toString();

        // Do they have an input?
        if (cityName != null) {
            // Move user to map activity
            Intent mapIntent = new Intent(getApplicationContext(), GTAMaps.class);
            mapIntent.putExtra("CityName", (String) cityName);
            startActivity(mapIntent);
        }

        else {
            Toast.makeText(getApplicationContext(), "City has not been enabled", Toast.LENGTH_LONG).show();
        }
    }
}
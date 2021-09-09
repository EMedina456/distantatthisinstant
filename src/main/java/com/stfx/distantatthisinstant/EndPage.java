package com.stfx.distantatthisinstant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EndPage extends AppCompatActivity {
    Button homeBtn;

    // Generate end page
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end_page);
        homeBtn = findViewById(R.id.button_home);
        homeBtn.setOnClickListener(new View.OnClickListener() {

            // Add functionality for button to go back to main activity
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
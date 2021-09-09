package com.stfx.distantatthisinstant;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WhatIsCovid extends AppCompatActivity {

    Button selfAssessmentBtn;
    // Generate article page
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_is_covid);
        selfAssessmentBtn = findViewById(R.id.selfAssesment);

        // Wait for a user click for the self assessment button
        selfAssessmentBtn.setOnClickListener(new View.OnClickListener() {
            // Move to self assessment activity
            public void onClick(View v) {
                Intent myIntent = new Intent(getApplicationContext(), SelfAssessment.class);
                startActivity(myIntent);
            }
        });
    }
}
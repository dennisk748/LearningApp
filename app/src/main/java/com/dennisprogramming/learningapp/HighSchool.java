package com.dennisprogramming.learningapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class HighSchool extends AppCompatActivity {

    CardView formOne;
    CardView formTwo;
    CardView formThree;
    CardView formFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_high_school);
        formOne = findViewById(R.id.formOne);
        formTwo = findViewById(R.id.formTwo);
        formThree = findViewById(R.id.formThree);
        formFour = findViewById(R.id.formFour);
    }
}

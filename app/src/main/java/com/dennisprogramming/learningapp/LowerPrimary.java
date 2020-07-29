package com.dennisprogramming.learningapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.dennisprogramming.learningapp.fragments.FirstGrade;

public class LowerPrimary extends AppCompatActivity {
    public static FragmentManager fragmentManager;
    CardView firstGrade;
    CardView secondGrade;
    CardView thirdGrade;
    CardView fourthGrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower_primary);
        firstGrade = findViewById(R.id.firstGrade);
        secondGrade = findViewById(R.id.secondGrade);
        thirdGrade = findViewById(R.id.thirdGrade);
        fourthGrade = findViewById(R.id.fourthGrade);


        firstGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LowerPrimary.this,FragmentHolder.class));
                //Fragment fragment = new FirstGrade();
                //FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                //transaction.replace(R.id.contaner, fragment);
                //transaction.commit();
                //fragmentManager = getSupportFragmentManager();
                //if(findViewById(R.id.first_Grade_fragment_container) != null){
                    //FragmentTransaction transaction = fragmentManager.beginTransaction();
                    //FirstGrade firstGrade = new FirstGrade();
                    //transaction.add(R.id.first_Grade_fragment_container,firstGrade,null);
                    //transaction.commit();
                //}

            }
        });
    }
}

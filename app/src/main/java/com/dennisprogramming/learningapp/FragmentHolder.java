package com.dennisprogramming.learningapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.dennisprogramming.learningapp.fragments.FirstGrade;


public class FragmentHolder extends AppCompatActivity {

    public static FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_holder);

        fragmentManager = getSupportFragmentManager();
        if(findViewById(R.id.first_Grade_fragment_container) != null){
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        FirstGrade firstGrade = new FirstGrade();
        transaction.add(R.id.first_Grade_fragment_container,firstGrade,null);
        transaction.commit();
    }
    }
}

package com.dennisprogramming.learningapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dennisprogramming.learningapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstGrade
 *newInstance} factory method to
 * create an instance of this fragment.
 *=*/
public class FirstGrade extends Fragment {


    public FirstGrade() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_grade, container, false);
    }
}

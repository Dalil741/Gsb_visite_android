package com.example.gsb_visite_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.gsb_visite_android.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class VisiteurActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String username, token;
    private User user;
    private ArrayList<Praticien> lesPraticiens;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visiteur);
    }
}
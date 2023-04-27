package com.example.gsb_visite_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.gsb_visite_android.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class VisiteurActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private String username;
    private Token token;
    private User user;
    private ArrayList<Praticien> lesPraticiens;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intent = getIntent();
        Token token = (Token) intent.getSerializableExtra("token");
        String username = (String) intent.getSerializableExtra("username");

    }
}
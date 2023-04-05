package com.example.gsb_visite_android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.gsb_visite_android.databinding.ActivityMainBinding;

import retrofit2.Call;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Token token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();

        binding.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GsbServices services = RetrofitClientInstance.getRetrofitInstance().create(GsbServices.class);
                Call<Token> token ;
            }
        });
    }


}
package com.example.gsb_visite_android;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.gsb_visite_android.databinding.ActivityMainBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


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
                Call<Token> call = services.getToken(new User("username", "password"));
                call.enqueue(new Callback<Token>() {
                    @Override
                    public void onResponse(Call<Token> call, Response<Token>
                            response) {
                       token = response.body();
                    }
                    @Override
                    public void onFailure(Call<Token> call, Throwable t) {
                        Toast.makeText(MainActivity.this, "Une erreur est survenue !",
                                Toast.LENGTH_SHORT).show();
                    }
                });


            }
            });
    }

    }


package com.example.gsb_visite_android;

import com.example.gsb_visite_android.Token;
import com.example.gsb_visite_android.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GsbServices {
    @POST("/login_check")
    Call<Token>  getToken(@Body User user);


}

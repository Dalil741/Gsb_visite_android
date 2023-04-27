package com.example.gsb_visite_android;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface GsbServices {
    @POST("login_check")
    Call<Token> getToken(@Body User user) ;

    @GET("users")
    Call<User> getUsers (@Header("Authorization") String authorization) ;
}

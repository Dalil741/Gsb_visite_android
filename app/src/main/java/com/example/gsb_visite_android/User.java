package com.example.gsb_visite_android;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class User implements Serializable {
  /*  @SerializedName("id")
    private int id;*/
    @SerializedName("username")
    private String username;
  /*  @SerializedName("email")
    private String email;*/
    @SerializedName("password")
    private String password;
  /*  @SerializedName("nom")
    private String nom;
    @SerializedName("prenom")
    private String prenom;
    @SerializedName("tel")
    private int tel;
    @SerializedName("matricule")
    private String matricule;*/


   // ArrayList<Praticien> praticiens;

    public User(String username, String password){
    this.username = username;
    this.password = password;
    }



}

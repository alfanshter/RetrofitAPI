package com.alfanshter.retrofitapi.service;

import com.alfanshter.retrofitapi.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
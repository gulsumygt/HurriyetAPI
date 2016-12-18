package com.example.android.hurriyetapi.rest;

import com.example.android.hurriyetapi.model.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by glsmy on 18.12.2016.
 */
public interface ApiInterface {
    @GET("articles?$filter=Path%20eq%20%27/gundem/%27")
    Call<List<News>> getNews(@Query("apikey") String apiKey);
}

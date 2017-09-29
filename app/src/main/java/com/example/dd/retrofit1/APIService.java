package com.example.dd.retrofit1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;



public interface APIService {
    @Headers("X-Auth-Token: YOUR_API_TOKEN")
    @GET("v1/competitions")

    Call<List<User>> getUserData();


}

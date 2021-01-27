package com.example.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("post")
    Call<List<Post>> getPosts();
}

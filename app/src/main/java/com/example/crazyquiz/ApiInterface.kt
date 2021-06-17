package com.example.crazyquiz

import retrofit.Callback
import retrofit.http.Field
import retrofit.http.FormUrlEncoded
import retrofit.http.GET
import retrofit.http.POST


interface ApiInterface {

    // For POST request
    @FormUrlEncoded // annotation that used with POST type request
    @POST("/scores.php") // specify the sub url for our base url
    fun newScore(
        @Field("name") name: String,
        @Field("score") score: String, Callback: Callback<POJO>)

    // for GET request
    @GET("/scores.php") // specify the sub url for our base url
    fun getScores(@Field("name") name: String, Callback: Callback<List<POJO>>)
}
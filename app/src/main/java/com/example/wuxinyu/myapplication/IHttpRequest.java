package com.example.wuxinyu.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by wuxinyu on 2018/4/13.
 */

public interface IHttpRequest {
    @GET("/search/avatarjson?tn=resultjsonavatarnew&ie=utf-8&cg=girl")
    Call<ImageModel> getImage(@Query("word") String work, @Query("rn") String rn, @Query("pn") String pn);

}

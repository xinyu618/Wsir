package com.example.wuxinyu.myapplication;

import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by wuxinyu on 2018/4/13.
 */

public class ImageUrlGrab {
    private Context mContext;
    private IHttpRequest mService;

    public ImageUrlGrab(Context context) {
        this.mContext = context;
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://image.baidu.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        mService = retrofit.create(IHttpRequest.class);
    }

    public List<String> getImageUrlList(int rn, int pn, String keywork, final CallBack callBack) {
        Call<ImageModel> modelCall = mService.getImage(keywork, rn + "", pn + "");
        modelCall.enqueue(new Callback<ImageModel>() {
            @Override
            public void onResponse(Call<ImageModel> call, Response<ImageModel> response) {
                Log.d("wjm", "onResponse");
                ImageModel imageModel = response.body();
                if (imageModel == null)
                    return;

                List<ImageModel.ImgsBean> imgsBeanList = imageModel.getImgs();
                if (imgsBeanList == null || imgsBeanList.size() == 0)
                    return;

                List<String> urlList = new ArrayList<String>();
                for (ImageModel.ImgsBean imgsBean : imgsBeanList) {
                    urlList.add(imgsBean.getObjURL());
                }

                callBack.callBackData(urlList);

            }

            @Override
            public void onFailure(Call<ImageModel> call, Throwable t) {
                Log.d("wjm", "onFailure");
            }
        });
        return null;
    }

    public interface CallBack {
        void callBackData(List<String> dataList);
    }


}

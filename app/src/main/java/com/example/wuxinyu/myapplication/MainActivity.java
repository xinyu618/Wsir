package com.example.wuxinyu.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.rl)
    RecyclerView mRecyclerView;
    MainBodyAdapter mAdapter;

    ImageUrlGrab imageUrlGrab;

    @BindView(R.id.ib)
    ImageButton mButton;

    static final int PAGE_SIZE = 60;

    int mPage = 60;

    public static float SIZE_RATIO;

    public static int WIDTH;

    public static int HEIGTH;

    private RotateAnimation mRotateAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        DisplayMetrics dm = getResources().getDisplayMetrics();
        int with = dm.widthPixels;
        WIDTH = with;
        int height = dm.heightPixels;
        HEIGTH = height;

        SIZE_RATIO = (float) with / height;


        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setNestedScrollingEnabled(false);
        PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
        pagerSnapHelper.attachToRecyclerView(mRecyclerView);


        mAdapter = new MainBodyAdapter(this);
        mRecyclerView.setAdapter(mAdapter);

        mRotateAnimation = new RotateAnimation(0, 360, dip2px(this, 40) / 2, dip2px(this, 40) / 2);
        mRotateAnimation.setDuration(250);
        mRotateAnimation.setFillAfter(true);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButton.startAnimation(mRotateAnimation);
                getData();
            }
        });

        imageUrlGrab = new ImageUrlGrab(this);

        getData();
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    private void getData() {
        Log.d("wjm", "mPage = " + mPage);
        imageUrlGrab.getImageUrlList(PAGE_SIZE, mPage, "清纯妹子", new ImageUrlGrab.CallBack() {
            @Override
            public void callBackData(List<String> dataList) {
                mAdapter.setDataList(dataList);
                mRecyclerView.post(new Runnable() {
                    @Override
                    public void run() {
                        mRecyclerView.scrollToPosition(0);
                    }
                });
            }
        });
        mPage = mPage + 60;
    }


}





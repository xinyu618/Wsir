package com.example.wuxinyu.myapplication;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.image.ImageInfo;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by wuxinyu on 2018/4/13.
 */

public class MainBodyAdapter extends RecyclerView.Adapter<MainBodyAdapter.MainBodyViewHodler> {
    private static final String TAG = "MainBodyAdapter";
    private final Context mContext;
    private final LayoutInflater mLayoutInflater;
    private List<String> mDataList;


    public MainBodyAdapter(Context context) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    public void setDataList(List<String> dataList) {
        this.mDataList = dataList;
        notifyDataSetChanged();
    }


    @Override
    public MainBodyViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MainBodyViewHodler(mLayoutInflater.inflate(R.layout.item_main_body, null));
    }

    @Override
    public void onBindViewHolder(MainBodyViewHodler holder, int position) {
        String urlStr = mDataList.get(position);
        if (TextUtils.isEmpty(urlStr))
            return;

        setControllerListener(holder.imageView, urlStr);
    }


    /**
     * 通过imageWidth的宽度，自动适应高度
     *
     * @param simpleDraweeView view
     * @param imagePath        Uri
     */
    public static void setControllerListener(final SimpleDraweeView simpleDraweeView, String imagePath) {
        final ViewGroup.LayoutParams layoutParams = simpleDraweeView.getLayoutParams();
        ControllerListener controllerListener = new BaseControllerListener<ImageInfo>() {
            @Override
            public void onFinalImageSet(String id, @Nullable ImageInfo imageInfo, @Nullable Animatable anim) {
                if (imageInfo == null) {
                    return;
                }
                int height = imageInfo.getHeight();
                int width = imageInfo.getWidth();

                int imageWidth = MainActivity.WIDTH;
                layoutParams.width = imageWidth;

                int imageHeight = (int) ((float) (imageWidth * height) / (float) width);
                if (imageHeight > MainActivity.HEIGTH) {
                    imageHeight = MainActivity.HEIGTH;
                }

                layoutParams.height = imageHeight;
                simpleDraweeView.setLayoutParams(layoutParams);
            }

            @Override
            public void onIntermediateImageSet(String id, @Nullable ImageInfo imageInfo) {

            }

            @Override
            public void onFailure(String id, Throwable throwable) {
                Log.d("wjm" , "onFailure");
            }
        };
        DraweeController controller = Fresco.newDraweeControllerBuilder()
                .setControllerListener(controllerListener).setUri(Uri.parse(imagePath)).build();
        simpleDraweeView.setController(controller);
    }


    @Override
    public int getItemCount() {
        return mDataList == null ? 0 : mDataList.size();
    }

    public static class MainBodyViewHodler extends RecyclerView.ViewHolder {
        @BindView(R.id.iv)
        SimpleDraweeView imageView;
        @BindView(R.id.tv)
        TextView textView;

        public MainBodyViewHodler(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.height = MainActivity.HEIGTH;
            layoutParams.width = MainActivity.WIDTH;
        }
    }

}

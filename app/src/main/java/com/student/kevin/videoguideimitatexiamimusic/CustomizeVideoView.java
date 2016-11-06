package com.student.kevin.videoguideimitatexiamimusic;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

/**
 * Created by Kevin on 2016/11/6.
 */

public class CustomizeVideoView extends VideoView{
    public CustomizeVideoView(Context context) {
        super(context);
    }

    public CustomizeVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomizeVideoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //我们重新计算高度
        int width = getDefaultSize(0, widthMeasureSpec);
        int height = getDefaultSize(0, heightMeasureSpec);
        setMeasuredDimension(width, height);
    }
}

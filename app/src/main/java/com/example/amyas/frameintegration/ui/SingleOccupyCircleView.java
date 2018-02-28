package com.example.amyas.frameintegration.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import com.example.amyas.frameintegration.R;


/**
 * 个人作业界面 作物的占比图
 * author: Amyas
 * date: 2018/1/22
 */

public class SingleOccupyCircleView extends View {
    private int width;
    private int height;
    // 放入的图片的左上角，在整个控件中的位置
    private int leftCornerX;
    private int leftCornerY;
    private int bitmapWidth;
    // 调整因int值导致的偏移
    private int offset = 4;
    private Bitmap mBitmap;
    private Paint mPaint;
    // 最外层圆弧 定位矩形
    private RectF mRectF1;
    // 内层圆弧 定位矩形
    private RectF mRectF2;
    private int color;
    private int mSweepAngle = 90;

    public SingleOccupyCircleView(Context context) {
        super(context);
        initView();
    }

    public SingleOccupyCircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public SingleOccupyCircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    public void setArguments(Bitmap bitmap, int color, int sweepAngle) {
        if(bitmap!=null){
            mBitmap = bitmap;
        }
        mSweepAngle = sweepAngle;
        this.color = color;
        postInvalidate();
    }

    private void initView() {

        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mBitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
//        canvas.drawBitmap(mBitmap,width/2,height/2,mPaint);
        canvas.drawBitmap(mBitmap,leftCornerX,leftCornerY,mPaint);
        mPaint.setColor(color);
        mPaint.setStrokeWidth(bitmapWidth / 6);
        canvas.drawArc(mRectF1, -90, mSweepAngle, false, mPaint);


    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        width = getMeasuredWidth();
        height = getMeasuredHeight();
        Log.e("single", "onMeasure: (x,y) = ("+width+","+height+")");
        initSize();

    }

    private void initSize() {
        bitmapWidth = mBitmap.getWidth();
        leftCornerX = width/2-bitmapWidth/2;
        leftCornerY = height/2-bitmapWidth/2;
        Log.e("single", "initSize: (leftCornerX,leftCornerY) = ("+leftCornerX+","+leftCornerY+")");
        mRectF1 = new RectF(leftCornerX-bitmapWidth/8+offset,leftCornerY-bitmapWidth/8+offset,
                leftCornerX+bitmapWidth*9/8-offset, leftCornerY+bitmapWidth*9/8-offset);
//        mRectF2 = new RectF(-1,)
    }


}

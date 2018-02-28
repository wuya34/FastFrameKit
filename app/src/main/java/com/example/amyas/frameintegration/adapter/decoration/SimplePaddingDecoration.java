package com.example.amyas.frameintegration.adapter.decoration;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.amyas.frameintegration.R;


/**
 * author: Amyas
 * date: 2018/1/18
 */

public class SimplePaddingDecoration extends RecyclerView.ItemDecoration {

    private int dividerHeight;
    private Paint dividerPaint;


    public SimplePaddingDecoration(Context context, int dividerHeight) {
        this.dividerHeight = dividerHeight;
        dividerPaint = new Paint();
//        dividerPaint.setColor(context.getResources().getColor(R.color.backgroundColor));
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.bottom = dividerHeight;//类似加了一个bottom padding
    }

    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        int childCount = parent.getChildCount();
        int left = parent.getPaddingLeft();
        int right = parent.getWidth()-parent.getPaddingRight();

        for (int i = 0; i < childCount; i++) {
            View view = parent.getChildAt(i);
            float top = view.getBottom();
            float bottom = view.getBottom()+dividerHeight;
            c.drawRect(left,top,right,bottom,dividerPaint);
        }
    }
}

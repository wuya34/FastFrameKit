package com.example.amyas.frameintegration.ui;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;

/**
 * author: Amyas
 * date: 2018/1/16
 */

public class WhitePopupWindow extends PopupWindow {

    public WhitePopupWindow(View contentView, int width, int height) {
        super(contentView, width, height);
    }

    @Override
    public void showAsDropDown(View anchor) {
        if (Build.VERSION.SDK_INT == 24) {
            Rect rect = new Rect();
            anchor.getGlobalVisibleRect(rect);
            int h = anchor.getResources().getDisplayMetrics().heightPixels - rect.bottom;
            setHeight(h);
        }
        super.showAsDropDown(anchor);
    }
}

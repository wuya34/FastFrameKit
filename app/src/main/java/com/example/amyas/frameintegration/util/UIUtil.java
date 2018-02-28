package com.example.amyas.frameintegration.util;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.youlu.uav.R;

import java.lang.ref.WeakReference;

/**
 * author: Amyas
 * date: 2018/1/6
 */

public class UIUtil {
    private static Toast toast;
    private static WeakReference<Context> sContextWeakReference;

    public static void showToast(Context context, String content){
        sContextWeakReference = new WeakReference<>(context);
        if (toast==null){
            toast = Toast.makeText(sContextWeakReference.get(), content, Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);

        }else {
            toast.setText(content);
        }
        toast.show();

    }

    /**
     *  短时间 SnackBar
     * @param view 绑定的view
     * @param s 消息字符串
     */
    public static void SnackBarShort(View view, String s){
        Snackbar.make(view, s, Snackbar.LENGTH_SHORT).show();
    }

    /**
     *  长时间 SnackBar
     * @param view 绑定的view
     * @param s 消息字符串
     */
    public static void SnackBarLong(View view, String s){
        Snackbar.make(view, s, Snackbar.LENGTH_LONG).show();
    }

    /**
     * 短时间 自定义背景颜色 文字颜色的 SnackBar
     * @param view 绑定的view
     * @param s 消息字符串
     * @param messageColor 文字颜色
     * @param backgroundColor SnackBar 背景颜色
     */
    public static void SnackBarShort(View view, String s, int messageColor, int backgroundColor){
        Snackbar snackbar = Snackbar.make(view, s, Snackbar.LENGTH_SHORT);
        setSnackBarColor(snackbar, messageColor,backgroundColor);
        snackbar.show();
    }

    /**
     * 长时间 自定义背景颜色 文字颜色的 SnackBar
     * @param view 绑定的view
     * @param s 消息字符串
     * @param messageColor 文字颜色
     * @param backgroundColor SnackBar 背景颜色
     */
    public static void SnackBarLong(View view, String s, int messageColor, int backgroundColor){
        Snackbar snackbar = Snackbar.make(view, s, Snackbar.LENGTH_LONG);
        setSnackBarColor(snackbar, messageColor,backgroundColor);
        snackbar.show();
    }

    /**
     * 设置 snackbar 的背景以及文字颜色
     * @param snackbar
     * @param messageColor
     * @param backgroundColor
     */
    private static void setSnackBarColor(Snackbar snackbar, int messageColor, int backgroundColor) {
        View view = snackbar.getView();
        if(view!=null){
            view.setBackgroundColor(backgroundColor);//修改view的背景色
            ((TextView) view.findViewById(R.id.snackbar_text)).setTextColor(messageColor);//获取Snackbar的message控件，修改字体颜色
        }
    }


}

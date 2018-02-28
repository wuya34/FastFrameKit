package com.example.amyas.frameintegration.util;


import android.content.Context;
import android.content.Intent;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.youlu.uav.base.App;
import com.youlu.uav.base.Constant;
import com.youlu.uav.db.Token;
import com.youlu.uav.db.UserInfo;
import com.youlu.uav.flier.activity.LoginByPasswordActivity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * author: Amyas
 * date: 2018/1/6
 */

public class ResponseUtil {

    /**
     * string 转 class
     *
     * @param s
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T toBean(String s, Class<T> tClass) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        return gson.fromJson(s, tClass);
    }

    /**
     * JsonObject 转 class
     *
     * @param s
     * @param tClass
     * @param <T>
     * @return
     */
    public static <T> T toBean(JsonObject s, Class<T> tClass) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        return gson.fromJson(s, tClass);
    }

    /**
     * String 转 Date
     *
     * @param d
     * @return
     */
    public static Date str2Date(String d) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        try {
            return sdf.parse(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * String 转 date(Long)
     *
     * @param d
     * @return
     */
    public static long str2DateLong(String d) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        try {
            return sdf.parse(d).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0L;
    }

    public static boolean checkIfRequestSuccess(Context context, int code, String msg) {
        if (checkCodeIfOk(code)) {
            return true;
        }
        dispatchException(context, code, msg);
        return false;
    }

    private static boolean checkCodeIfOk(int code) {
        return code == Constant.REQUEST_OK;
    }

    private static void dispatchException(Context context, int code, String msg) {
        switch (code) {
            case 1001:
                UIUtil.showToast(context, "会话超时，请重新登录");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ((App) context.getApplicationContext()).getBoxStore().boxFor(UserInfo.class).removeAll();
                ((App) context.getApplicationContext()).getBoxStore().boxFor(Token.class).removeAll();
                Intent intent = new Intent(context, LoginByPasswordActivity.class);
                context.startActivity(intent);
                break;
            default:
                UIUtil.showToast(context, msg);
                break;
        }

    }

}

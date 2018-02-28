package com.example.amyas.frameintegration.util;

import android.support.annotation.Nullable;

import com.orhanobut.logger.Logger;

/**
 * author: Amyas
 * date: 2018/1/6
 */

public class LogUtil {

    public static void d(@Nullable String o) {
        if (o == null) {
            Logger.d("");
        } else {
            Logger.d(o);
        }
    }

    public static void e(@Nullable String s) {
        Logger.e(s);
    }

    public static void e(@Nullable String s, @Nullable Object o) {
        if (s == null) {
            Logger.e("");
        }
        if (o == null) {
            Logger.e(s);
        } else {
            Logger.e(s, o);
        }
    }


}

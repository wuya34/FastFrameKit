package com.example.amyas.frameintegration.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * author: Amyas
 * date: 2018/1/6
 */

public class ActivityUtil {

    public static void addFragmentToActivity(FragmentManager manager, Fragment fragment, int resId){
        FragmentTransaction t = manager.beginTransaction();
        t.replace(resId, fragment);
        t.commit();
    }
}

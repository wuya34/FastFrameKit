package com.example.amyas.frameintegration;

import android.app.Application;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.FormatStrategy;
import com.orhanobut.logger.PrettyFormatStrategy;
import com.squareup.leakcanary.LeakCanary;

import io.objectbox.BoxStore;

/**
 * author: Amyas
 * date: 2017/12/21
 */

public class MyApp extends Application {
    private static BoxStore mBoxStore;
    @Override
    public void onCreate() {
        super.onCreate();
        // 日志框架init
        FormatStrategy formatStrategy = PrettyFormatStrategy.newBuilder()
                .showThreadInfo(true)
                .tag("Frame Integration")
                .build();
        com.orhanobut.logger.Logger.addLogAdapter(new AndroidLogAdapter(formatStrategy){
            @Override
            public boolean isLoggable(int priority, String tag) {
                return BuildConfig.DEBUG;
            }
        });

        // 数据库 ObjectBox
        mBoxStore = MyObjectBox.builder().androidContext(this).build();
        // leak canary
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
    }

    public BoxStore getBoxStore(){
        return mBoxStore;
    }
}

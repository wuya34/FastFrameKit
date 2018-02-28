package com.example.amyas.frameintegration;

import android.os.Bundle;


import com.example.amyas.frameintegration.base.BaseActivity;
import com.orhanobut.logger.Logger;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.d("aaa");
    }
}

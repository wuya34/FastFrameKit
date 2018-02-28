package com.example.amyas.frameintegration.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * author: Amyas
 * date: 2018/1/16
 */

public class TaskFragmentPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragments;

    public TaskFragmentPagerAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        mFragments = fragments;
    }


    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}

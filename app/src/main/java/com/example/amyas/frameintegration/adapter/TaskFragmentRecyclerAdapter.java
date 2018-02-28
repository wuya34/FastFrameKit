package com.example.amyas.frameintegration.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * author: Amyas
 * date: 2018/1/16
 */

public class TaskFragmentRecyclerAdapter extends RecyclerView.Adapter<TaskFragmentRecyclerAdapter.MyHolder> {
//    private

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class MyHolder extends RecyclerView.ViewHolder{

        public MyHolder(View itemView) {
            super(itemView);
        }
    }
}

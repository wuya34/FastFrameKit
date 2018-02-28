//package com.example.amyas.frameintegration.ui;
//
//import android.app.Dialog;
//import android.content.Context;
//import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
//import android.widget.TextView;
//
//
//
///**
// * author: Amyas
// * date: 2018/1/20
// */
//
//public class Dialog3Line2Button extends Dialog {
//    private TextView titleView;
//    private TextView descriptionView1;
//    private TextView descriptionView2;
//    private TextView descriptionView3;
//    private TextView cancelView;
//    private TextView confirmView;
//
//    private String title = "提示";
//    private String description1 = "描述";
//    private String description2 = "描述";
//    private String description3 = "描述";
//    private String cancel = "取消";
//    private String confirm = "确定";
//    private onOptionClickListener mListener;
//    public Dialog3Line2Button(@NonNull Context context) {
//        super(context);
//    }
//    public Dialog3Line2Button(@NonNull Context context, int themeResId) {
//        super(context, themeResId);
//    }
//
//    protected Dialog3Line2Button(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
//        super(context, cancelable, cancelListener);
//    }
//
//    public Dialog3Line2Button setDescription2(String description2) {
//        this.description2 = description2;
//        return this;
//    }
//
//    public Dialog3Line2Button setDescription3(String description3) {
//        this.description3 = description3;
//        return this;
//    }
//
//    public void setListener(onOptionClickListener listener) {
//        mListener = listener;
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.dialog_3line_2button);
//        config();
//    }
//
//    private void config() {
//        titleView = findViewById(R.id.title);
//        descriptionView1 = findViewById(R.id.description1);
//        cancelView = findViewById(R.id.cancel);
//        confirmView = findViewById(R.id.confirm);
//        descriptionView2 = findViewById(R.id.description2);
//        descriptionView3 = findViewById(R.id.description3);
//
//        titleView.setText(title);
//        descriptionView1.setText(description1);
//        cancelView.setText(cancel);
//        confirmView.setText(confirm);
//        descriptionView2.setText(description2);
//        descriptionView3.setText(description3);
//
//
//        cancelView.setOnClickListener(view -> mListener.onCancelClick());
//        confirmView.setOnClickListener(view -> mListener.onConfirmClick());
//    }
//
//    public Dialog3Line2Button setTitle(String title) {
//        this.title = title;
//        return this;
//    }
//
//    public Dialog3Line2Button setDescription1(String description1) {
//        this.description1 = description1;
//        return this;
//    }
//
//    public Dialog3Line2Button setCancel(String cancel) {
//        this.cancel = cancel;
//        return this;
//    }
//
//    public Dialog3Line2Button setConfirm(String confirm) {
//        this.confirm = confirm;
//        return this;
//    }
//
//    public interface onOptionClickListener {
//        void onCancelClick();
//
//        void onConfirmClick();
//    }
//}

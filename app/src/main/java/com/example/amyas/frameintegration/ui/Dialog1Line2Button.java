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
// * 自定义dialog 必须实现 onOptionClickListener，对确定以及取消的回调处理
// * author: Amyas
// * date: 2018/1/20
// */
//
//public class Dialog1Line2Button extends Dialog {
//    private TextView titleView;
//    private TextView descriptionView;
//    private TextView cancelView;
//    private TextView confirmView;
//
//    private String title = "提示";
//    private String description = "描述";
//    private String cancel = "取消";
//    private String confirm = "确定";
//    private onOptionClickListener mListener;
//
//    public interface onOptionClickListener{
//        void onCancelClick();
//        void onConfirmClick();
//    }
//
//    public void setListener(onOptionClickListener listener){
//        mListener = listener;
//    }
//
//
//
//    public Dialog1Line2Button(@NonNull Context context) {
//        super(context);
//    }
//
//    public Dialog1Line2Button(@NonNull Context context, int themeResId) {
//        super(context, themeResId);
//    }
//
//    protected Dialog1Line2Button(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
//        super(context, cancelable, cancelListener);
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.dialog_symmetry);
//        config();
//    }
//
//    private void config() {
//        titleView = findViewById(R.id.title);
//        descriptionView = findViewById(R.id.description);
//        cancelView = findViewById(R.id.cancel);
//        confirmView = findViewById(R.id.confirm);
//
//        titleView.setText(title);
//        descriptionView.setText(description);
//        cancelView.setText(cancel);
//        confirmView.setText(confirm);
//
//        cancelView.setOnClickListener(view -> mListener.onCancelClick());
//        confirmView.setOnClickListener(view -> mListener.onConfirmClick());
//    }
//
//
//    public Dialog1Line2Button setTitle(String title){
//        this.title = title;
//        return this;
//    }
//    public Dialog1Line2Button setDescription(String description){
//        this.description = description;
//        return this;
//    }
//    public Dialog1Line2Button setCancel(String cancel){
//        this.cancel = cancel;
//        return this;
//    }
//    public Dialog1Line2Button setConfirm(String confirm){
//        this.confirm = confirm;
//        return this;
//    }
//}

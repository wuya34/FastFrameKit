//package com.example.amyas.frameintegration.ui;
//
//import android.app.Dialog;
//import android.content.Context;
//import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.annotation.Nullable;
//
//import com.prolificinteractive.materialcalendarview.CalendarDay;
//import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
//
///**
// * author: Amyas
// * date: 2018/2/8
// */
//
//public class DialogCalender extends Dialog {
//    private MaterialCalendarView mMaterialCalendarView;
//    private int count = 0;
//    private CalendarDay mCalendarDay;
//    private CalendarDay mCalendarEndDay;
//    public DialogCalender(@NonNull Context context) {
//        super(context);
//    }
//
//    public DialogCalender(@NonNull Context context, int themeResId) {
//        super(context, themeResId);
//    }
//
//    protected DialogCalender(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
//        super(context, cancelable, cancelListener);
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.dialog_calender);
//        setCanceledOnTouchOutside(false);
//        configWidget();
//    }
//
//    private void configWidget() {
//        mMaterialCalendarView = findViewById(R.id.calendar);
//        mMaterialCalendarView.setSelectionMode(MaterialCalendarView.SELECTION_MODE_MULTIPLE);
//        mMaterialCalendarView.setOnDateChangedListener((widget, date, selected) -> {
//            count++;
//            if (count == 2) {
//                if (date.isAfter(mCalendarDay)) {
//                    mCalendarEndDay = date;
//                    mListener.onFinishSelected(mCalendarDay, mCalendarEndDay);
//                    this.dismiss();
//                    return;
//                } else {
//                    mMaterialCalendarView.clearSelection();
//                    mMaterialCalendarView.setDateSelected(date, true);
//                    mCalendarDay = date;
//                    count = 1;
//                    return;
//                }
//            }
//            mCalendarDay = date;
//        });
//    }
//
//    public CalendarDay[] getSelectDays(){
//        CalendarDay[] calendarDays = new CalendarDay[2];
//        calendarDays[0] = mCalendarDay;
//        calendarDays[1] = mCalendarEndDay;
//        return calendarDays;
//    }
//
//    private OnDaysSelectedListener mListener;
//    public void setListener(OnDaysSelectedListener listener){
//        mListener = listener;
//    }
//
//    public interface OnDaysSelectedListener {
//        void onFinishSelected(CalendarDay day1, CalendarDay day2);
//    }
//}

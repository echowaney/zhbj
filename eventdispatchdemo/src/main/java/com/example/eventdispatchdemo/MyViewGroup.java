package com.example.eventdispatchdemo;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by HashWaney on 2017/1/26.
 */

public class MyViewGroup
        extends ViewGroup
{

    public MyViewGroup(Context context) {
        this(context,null);
    }


    public MyViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);


    }

    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyViewGroup(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        View childAt = getChildAt(0);
        childAt.measure(widthMeasureSpec,heightMeasureSpec);
//        childAt.measure(0,0);

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
            getChildAt(0).layout(l,t,r,b);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("MainActivity", "  MyViewGroup           dispatchTouchEvent: ");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("MainActivity", "   MyViewGroup         onInterceptTouchEvent:");
        return super.onInterceptTouchEvent(ev);
//    return true;//true ：表示拦截事件，不往下传递事件，
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("MainActivity", "  MyViewGroup            onTouchEvent: ");
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:

                Log.d("MainActivity", "MyViewGroup     按下: ");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("MainActivity", "MyViewGroup     移动: ");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("MainActivity", "MyViewGroup     弹起: ");
                break;


        }
        return true;
    }
}

package com.example.eventdispatchdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by HashWaney on 2017/1/26.
 */

public class MyView
        extends View
{
    private Paint mPaint;

    public MyView(Context context) {
        this(context,null);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint =new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.RED);
        mPaint.setTextSize(20);

    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr) {
        this(context, attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText("事件传递",150,500,mPaint);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("MainActivity", "  MyView             dispatchTouchEvent: ");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("MainActivity", "   MyView            onTouchEvent: ");
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:

                Log.d("MainActivity", "MyView     按下: ");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("MainActivity", "MyView     移动: ");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("MainActivity", "MyView     弹起: ");
                break;


        }

//        return super.onTouchEvent(event);
        return true;

    }
}

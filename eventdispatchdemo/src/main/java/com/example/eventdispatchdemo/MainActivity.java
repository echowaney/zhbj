package com.example.eventdispatchdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity
        extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("MainActivity", "  MainActivity        dispatchTouchEvent: ");

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("MainActivity", "MainActivity           onTouchEvent: ");
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:

                Log.d("MainActivity", "MainActivity     按下: ");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("MainActivity", "MainActivity     移动: ");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("MainActivity", "MainActivity     弹起: ");
                break;


        }

        return super.onTouchEvent(event);
    }
}

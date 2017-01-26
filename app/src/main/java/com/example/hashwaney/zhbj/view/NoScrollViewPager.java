package com.example.hashwaney.zhbj.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by HashWaney on 2017/1/27.
 *  禁用主界面的viewpager的滑动事件
 *  当fragment中有需要滑动的viewpager ，就需要将主界面的viewpager禁用滑动
 */

public class NoScrollViewPager
        extends ViewPager
{
    public NoScrollViewPager(Context context) {
        this(context,null);
    }

    public NoScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    //默认 不拦截 事件
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        return false;

    }
    // 不消费此事件， 就不回去处理touch 和move 事件
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }
}

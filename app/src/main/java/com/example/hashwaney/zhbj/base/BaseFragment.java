package com.example.hashwaney.zhbj.base;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 *  basefragment 的基本抽取
 *  抽取原则: 共性内容的抽取,
 *          非共性的内容有具体的子类去完成
 *
 */

public abstract class BaseFragment
        extends Fragment
{

    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState)
    {
        TextView textView =new TextView(container.getContext());
//        textView.setText("首页");       //不是共性内容
        textView.setGravity(Gravity.CENTER);
        textView.setTextSize(20);
        textView.setTextColor(Color.RED);
        return textView;
    }

    //在view创建完成之后,进行调用
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setContent();
    }

    //定义一个抽象方法 让子类去完成
    public abstract  void setContent();
}

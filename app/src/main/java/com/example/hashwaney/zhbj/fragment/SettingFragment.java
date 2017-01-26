package com.example.hashwaney.zhbj.fragment;

import android.widget.TextView;

import com.example.hashwaney.zhbj.base.BaseFragment;

/**
 * Created by HashWaney on 2017/1/26.
 */

public class SettingFragment
        extends BaseFragment
{


    @Override
    public void setContent() {
        ((TextView)getView()).setText("设置页面");
    }
}

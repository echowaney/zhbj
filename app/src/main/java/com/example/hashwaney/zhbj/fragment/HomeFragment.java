package com.example.hashwaney.zhbj.fragment;

import android.widget.TextView;

import com.example.hashwaney.zhbj.base.BaseFragment;
import com.example.hashwaney.zhbj.base.BaseLoadNetDataOperator;

/**
 * Created by HashWaney on 2017/1/26.
 */

public class HomeFragment
        extends BaseFragment implements BaseLoadNetDataOperator
{


    @Override
    public void setContent() {
        ((TextView)getView()).setText("首页");
    }

    @Override
    public void onLoadNewData(String url) {

    }

    @Override
    public void onLoadMoreData(String url) {

    }
}

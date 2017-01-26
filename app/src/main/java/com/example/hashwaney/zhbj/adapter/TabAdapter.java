package com.example.hashwaney.zhbj.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by HashWaney on 2017/1/26.
 */

public class TabAdapter
        extends FragmentPagerAdapter
{
    //集合
    private List<Fragment> mFragmentList;

    public TabAdapter(FragmentManager fm, List<Fragment> fragmentList) {

        super(fm);
        mFragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList==null?0:mFragmentList.size();
    }
}

package com.example.hashwaney.zhbj.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.hashwaney.zhbj.R;
import com.example.hashwaney.zhbj.adapter.TabAdapter;
import com.example.hashwaney.zhbj.fragment.GovaffairsFragment;
import com.example.hashwaney.zhbj.fragment.HomeFragment;
import com.example.hashwaney.zhbj.fragment.NewsCenterFragment;
import com.example.hashwaney.zhbj.fragment.SettingFragment;
import com.example.hashwaney.zhbj.fragment.SmarServiceFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity
        extends AppCompatActivity
{

    private ViewPager mViewPager;
    private        List<Fragment> fragmentLists =new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initVp();
    }


    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.vp);


    }
    //初始化viepager
    private void initVp() {
        fragmentLists.add(new HomeFragment());
        fragmentLists.add(new NewsCenterFragment());
        fragmentLists.add(new SmarServiceFragment());
        fragmentLists.add(new SettingFragment());
        fragmentLists.add(new GovaffairsFragment());
        TabAdapter adapter =new TabAdapter(getSupportFragmentManager(), fragmentLists);
        mViewPager.setAdapter(adapter);
    }
}

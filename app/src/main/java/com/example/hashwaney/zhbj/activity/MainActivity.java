package com.example.hashwaney.zhbj.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

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
        implements RadioGroup.OnCheckedChangeListener, ViewPager.OnPageChangeListener
{

    private ViewPager mViewPager;
    private List<Fragment> fragmentLists = new ArrayList<>();
    private RadioGroup mRadioGroup;
    private RadioButton mRb_home;
    private RadioButton mRb_newscenter;
    private RadioButton mRb_smartservice;
    private RadioButton mRb_setting;
    private RadioButton mRb_govffairs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initVp();
    }


    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.vp);
        mRadioGroup = (RadioGroup) findViewById(R.id.rg);
        mRb_home = (RadioButton) findViewById(R.id.rb_home);
        mRb_newscenter = (RadioButton) findViewById(R.id.rb_newscenter);
        mRb_smartservice = (RadioButton) findViewById(R.id.rb_smartservice);
        mRb_setting = (RadioButton) findViewById(R.id.rb_setting);
        mRb_govffairs = (RadioButton) findViewById(R.id.rb_govffairs);
        mRadioGroup.setOnCheckedChangeListener(this);
//        mViewPager.setOnPageChangeListener();
        //对viewpager进行页面切换监听
        mViewPager.addOnPageChangeListener(this);

    }

    //初始化viepager
    private void initVp() {
        fragmentLists.add(new HomeFragment());
        fragmentLists.add(new NewsCenterFragment());
        fragmentLists.add(new SmarServiceFragment());
        fragmentLists.add(new SettingFragment());
        fragmentLists.add(new GovaffairsFragment());
        TabAdapter adapter = new TabAdapter(getSupportFragmentManager(), fragmentLists);
        mViewPager.setAdapter(adapter);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        //checkId代表了是选中的条目id
        int item = 0;
        switch (checkedId) {
            case R.id.rb_home:
                item = 0;

                break;
            case R.id.rb_newscenter:
                item = 1;
                break;
            case R.id.rb_smartservice:
                item = 2;
                break;
            case R.id.rb_setting:
                item = 3;
                break;
            case R.id.rb_govffairs:
                item = 4;
                break;
        }

        //当radiogroup点击选中radiobutton viewpager切换对应的fragment
        mViewPager.setCurrentItem(item, false);//

    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {



    }
    //在页面被选中的时候进行相应的操作
    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                mRb_home.setChecked(true);
                 break;
            case 1:
                mRb_newscenter.setChecked(true);
                break;
            case 2:
                mRb_smartservice.setChecked(true);
                break;
            case 3:
                mRb_setting.setChecked(true);
                break;
            case 4:
                mRb_govffairs.setChecked(true);
                break;
        }


    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}

package com.example.testviewpagerindicator;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.viewpagerindicator.TabPageIndicator;

import java.util.ArrayList;
import java.util.List;
//不能继承AppActivity,为什么> 因为 给PageIndicator 指定一个主题,那么AppCompatActivity 本身就有一个主题
//还得给MainActivity 加上一个主题
public class MainActivity
        extends Activity
{

    private ViewPager      mVp;
    private TabPageIndicator  mPindicator;
    private List<TextView> content;
    private String[] names = new String[]{"体育",
                                          "CBA",
                                          "NBA",
                                          "WCC",
                                          "TVB",
                                          "CCTV",
                                          "都市",
                                          "娱乐",
                                          "八卦",
                                          "旅游",
                                          "女性",
                                          "育儿",
                                          "购物",
                                          "音乐"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVp = (ViewPager) findViewById(R.id.vp);
        mPindicator = (TabPageIndicator) findViewById(R.id.titlepageindicator);
        //关联viewpager,不然无法响应viewpager的滑动



        initViewpager();
    }

    //初始化viewpager
    private void initViewpager() {

        content = new ArrayList<>();
        for (String name : names) {

            TextView tv = new TextView(this);
            tv.setText(name);
            tv.setTextColor(Color.RED);
            tv.setTextSize(20);
            tv.setGravity(Gravity.CENTER);
            content.add(tv);
        }

        MyAdapter adapter = new MyAdapter();

        mVp.setAdapter(adapter);
        mPindicator.setViewPager(mVp,3);




    }

    class MyAdapter
            extends PagerAdapter
    {

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            TextView textView = content.get(position);
            String   contents        = textView.getText()
                                        .toString();
            Log.d("result", "instantiateItem: "+ contents);
            container.addView(textView);//这一步一定要加 ,不然不会有内容,视图没有加入到容器中,就不会有视图
            return textView;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {

            container.removeView((View) object);

        }

        @Override
        public int getCount() {
            return content.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view ==object;
        }
        //该方法必须复写,不然不会出现标题
        @Override
        public CharSequence getPageTitle(int position) {
            return names[position];
        }

    }
}

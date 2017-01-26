package com.example.hashwaney.zhbj.fragment;

import android.widget.TextView;

import com.example.hashwaney.zhbj.base.BaseFragment;
import com.example.hashwaney.zhbj.base.BaseLoadNetDataOperator;

/**
 * Created by HashWaney on 2017/1/26.
 */

public class GovaffairsFragment
        extends BaseFragment implements BaseLoadNetDataOperator
{
    @Override
    public void setContent() {
        TextView view = (TextView) getView();
        view.setText("政务");
    }

    @Override
    public void onLoadNewData(String url) {

    }

    @Override
    public void onLoadMoreData(String url) {

    }
    //    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater,
//                             @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstanceState)
//    {
//        TextView textView =new TextView(container.getContext());
//        textView.setText("首页");
//        textView.setGravity(Gravity.CENTER);
//        textView.setTextSize(20);
//        textView.setTextColor(Color.RED);
//        return textView;
//    }
}

package com.example.hashwaney.zhbj.base;

/**
 * Created by HashWaney on 2017/1/26.
 * 这是用来处理加载网络数据的接口
 */

public interface BaseLoadNetDataOperator {
    void onLoadNewData(String url);
    void onLoadMoreData(String url);
}


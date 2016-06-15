package com.shirun.androidmvp.pro.essence.view;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.shirun.androidmvp.R;
import com.shirun.androidmvp.bean.EssecneListBean;
import com.shirun.androidmvp.pro.essence.view.adapter.EssenceAllAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ying on 2016/6/13.
 * 全部
 */
public class EssenceAllFragment extends EssenceContentFragment {

    private RecyclerView recyclerView;
    private EssenceAllAdapter adapter;
    private List<EssecneListBean.ListBean> list;

    @Override
    protected void initView(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.essence_all_recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        list = new ArrayList<>();
        adapter = new EssenceAllAdapter(list,getActivity());
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_essence_all;
    }
}

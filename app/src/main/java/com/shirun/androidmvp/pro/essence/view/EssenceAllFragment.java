package com.shirun.androidmvp.pro.essence.view;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.shirun.androidmvp.R;
import com.shirun.androidmvp.bean.EssecneListBean;
import com.shirun.androidmvp.mvp.presenter.MvpPresenter;
import com.shirun.androidmvp.pro.essence.presenter.EssenceAllPresenter;
import com.shirun.androidmvp.pro.essence.view.adapter.EssenceAllAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ying on 2016/6/13.
 * 全部
 */
public class EssenceAllFragment extends EssenceContentFragment<EssenceAllPresenter> implements IEssenceAllView{

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
    protected void initData() {
        getPresenter().getAllEssence(getType());
    }


    @Override
    protected EssenceAllPresenter bindPresenter() {
        return new EssenceAllPresenter(getContext());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_essence_all;
    }

    @Override
    public void showDialog() {
        showLoading(true);
    }

    @Override
    public void hideDialog() {
        showLoading(false);
    }

    @Override
    public void loadData(List<EssecneListBean.ListBean> data) {
        adapter.addData(data);
    }


    @Override
    public void error(Exception e) {

    }
}

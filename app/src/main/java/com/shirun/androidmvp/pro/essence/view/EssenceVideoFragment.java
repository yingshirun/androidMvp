package com.shirun.androidmvp.pro.essence.view;

import android.util.Log;
import android.view.View;

import com.shirun.androidmvp.R;

/**
 * Created by machenike on 2016/5/29.
 * 视频
 */
public class EssenceVideoFragment extends EssenceContentFragment {

//    private XRefreshView refreshView;
//    private RecyclerView recyclerView;
//    private List<PostsListBean.PostList> mData =  new ArrayList<>();
//    private EssenceVideoAdapter essenceVideoAdapter;

    @Override
    protected void initView(View view) {
        Log.e("Content", getTitle() + "  type:" + getType());
//        refreshView = (XRefreshView) view.findViewById(R.id.xrefreshview_essence_video);
//        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView_essence_video);
//        refreshView.setPullRefreshEnable(true);
//        refreshView.setPullLoadEnable(true);
//        refreshView.setPinnedTime(1000);
//        refreshView.setAutoLoadMore(true);
//
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//
//        essenceVideoAdapter = new EssenceVideoAdapter(getContext(), mData);
//        recyclerView.setAdapter(essenceVideoAdapter);
//        essenceVideoAdapter.setCustomLoadMoreView(new XRefreshViewFooter(getContext()));
//
//        refreshView.setXRefreshViewListener(new XRefreshView.SimpleXRefreshListener(){
//            @Override
//            public void onRefresh() {
//                //下拉刷新
//                loadData(true);
//            }
//
//            @Override
//            public void onLoadMore(boolean isSlience) {
//                //加载更多
//                loadData(false);
//            }
//        });
    }

//    @Override
//    protected EssenceVideoPresenter bindPresenter() {
//        return new EssenceVideoPresenter(getContext());
//    }

    @Override
    protected void initData() {
        loadData(true);
    }

    private void loadData(final boolean isDownRefresh) {
//        getPresenter().getEssenceList(getType(), true, new BasePresenter.OnUIThreadListener<PostsListBean>() {
//            @Override
//            public void onResult(PostsListBean result) {
//                if(isDownRefresh){
//                    refreshView.stopRefresh();
//                }else{
//                    refreshView.stopLoadMore();
//                }
//                if(result == null){
//                    ToastUtil.showToast(getContext(),"加载失败");
//                }else{
//                    ToastUtil.showToast(getContext(),"成功");
//                    if(isDownRefresh){
//                        mData.clear();
//                    }
//                    mData.addAll(result.getList());
//                    essenceVideoAdapter.notifyDataSetChanged();
//                }
//            }
//        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_essence_video;
    }
}

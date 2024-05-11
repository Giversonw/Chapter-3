package com.example.chapter3.homework;


import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PlaceholderFragment extends Fragment {

    private View lottieView;
    private View listView;
    private String[] friends = new String[]{" ", "好友1", "好友2","好友3"};
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO ex3-3: 修改 fragment_placeholder，添加 loading 控件和列表视图控件

        View view = inflater.inflate(R.layout.fragment_placeholder, container, false);
        lottieView = view.findViewById(R.id.lottie_loading); // 假设有一个 ID 为lottie_loading的 Lottie 动画视图
        listView = view.findViewById(R.id.list_view); // 假设有一个 ID 为 list_view 的 ListView

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getActivity(), // 当前Fragment的Activity上下文
                android.R.layout.simple_list_item_1, // 使用系统自带的ListItem布局
                friends // 数据源
        );

        // 设置适配器
        ((ListView) listView).setAdapter(adapter);

        listView.setAlpha(0f); // 将列表视图初始化为完全透明

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        getView().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                // 这里会在 5s 后执行
//                // TODO ex3-4：实现动画，将 lottie 控件淡出，列表数据淡入
//
//
////                RainbowTextView(
//            }
//        }, 5000);

        getView().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Lottie 控件淡出动画
                ObjectAnimator lottieFadeOut = ObjectAnimator.ofFloat(lottieView, "alpha", 1f, 0f);
                lottieFadeOut.setDuration(1000); // 动画持续时间（1秒）

                // 列表数据淡入动画
                ObjectAnimator listFadeIn = ObjectAnimator.ofFloat(listView, "alpha", 0f, 1f);
                listFadeIn.setDuration(1000);

                lottieFadeOut.start();
                listFadeIn.start();
            }
        }, 5000);
    }
}

package com.example.chapter3.homework;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AllFriendsFragment extends Fragment{

    public AllFriendsFragment(){

    }

    //    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle saveInstanceState){
        return inflater.inflate(R.layout.fragment_all_friends,container,false);
    }
}



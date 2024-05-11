package com.example.chapter3.homework;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FriendsPagerAdapter extends FragmentPagerAdapter {
    private String[] tabTitles =new String[]{"好友列表","我的好友"};

    public FriendsPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PlaceholderFragment();
            case 1:
                return new AllFriendsFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position){
        return tabTitles[position];
    }
}

package com.example.chapter3.homework;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
//    private ViewPager viewPager;
//    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_ex1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Ch3Ex1Activity.class));
            }
        });
        findViewById(R.id.btn_ex2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Ch3Ex2Activity.class));
            }
        });
        findViewById(R.id.btn_ex3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Ch3Ex3Activity.class));
            }
        });

//        viewPager = findViewById(R.id.view_paper);
//        tabLayout=findViewById(R.id.tab_layout);
//
//        FriendsPagerAdapter adapter= new FriendsPagerAdapter(getSupportFragmentManager());
//        viewPager.setAdapter(adapter);
//        tabLayout.setupWithViewPager(viewPager);
    }
}

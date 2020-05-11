package com.hayaqo.viewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    ViewPagerAdapter adapter;
    ViewPager pagerMain;
    TabLayout tabMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[] arrImages = {
                R.drawable.bg1,
                R.drawable.bg2,
                R.drawable.bg3
        };

        adapter = new ViewPagerAdapter(arrImages, this);

        pagerMain = findViewById(R.id.pager_main);
        tabMain = findViewById(R.id.tab_main);

        pagerMain.setAdapter(adapter);
        tabMain.setupWithViewPager(pagerMain);

        //JADIIIIIII KELAARRRRR

        //dahhhh kelaaarrrr gitu doang
    }
}

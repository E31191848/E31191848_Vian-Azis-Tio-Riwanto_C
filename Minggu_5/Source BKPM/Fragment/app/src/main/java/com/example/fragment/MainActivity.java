package com.example.fragment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this, getSupportFragmentManager());

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(viewPagerAdapter);

        TabLayout tabLayout  = findViewById(R.id.tabs);

        tabLayout .setupWithViewPager(viewPager);
        int[] tabIcons = {
                R.drawable.ic_baseline_home_24,
                R.drawable.ic_baseline_preview_24,
                R.drawable.ic_baseline_image_search_24
        };

        for(int i=0; i<tabLayout.getTabCount(); i++){
            if(tabLayout.getTabAt(i) != null){
                tabLayout.getTabAt(i).setIcon(tabIcons[i]);
            }
        }

    }
}
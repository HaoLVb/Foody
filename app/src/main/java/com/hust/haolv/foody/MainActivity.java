package com.hust.haolv.foody;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.hust.haolv.foody.adapter.ViewPagerAdapter;
import com.hust.haolv.foody.fragment.AnGiFragment;
import com.hust.haolv.foody.fragment.ODauFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        setUpViewPager(viewPager);
    }

    private void setUpViewPager(final ViewPager viewPager) {
        ViewPagerAdapter mainAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        mainAdapter.addFrag(ODauFragment.newInstance(), null);
        mainAdapter.addFrag(AnGiFragment.newInstance(), null);
        viewPager.setAdapter(mainAdapter);
        viewPager.setOffscreenPageLimit(2);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition(), false);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tabLayout.getTabAt(position).select();

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void findView() {
//        toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
    }

    //    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
}

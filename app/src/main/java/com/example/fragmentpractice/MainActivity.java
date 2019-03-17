package com.example.fragmentpractice;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tabs.R;
import com.example.fragmentpractice.ui.ExploreFragment;
import com.example.fragmentpractice.ui.QuizFragment;
import com.example.fragmentpractice.ui.StoreFragment;
import com.example.fragmentpractice.ui.ViewPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tab_id)
    TabLayout tabLayout;

    @BindView(R.id.appbar)
    AppBarLayout appBarLayout;

    @BindView(R.id.viewpager)
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //Adding Fragments
        adapter.addFragment(new ExploreFragment(),"Explore");
        adapter.addFragment(new QuizFragment(),"Quiz");
        adapter.addFragment(new StoreFragment(),"Store");

        //AdapterSetup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}

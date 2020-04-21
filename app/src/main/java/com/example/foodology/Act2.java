package com.example.foodology;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

//public class Act2 extends AppCompatActivity {

   // @Override
    //protected void onCreate(Bundle savedInstanceState) {
       // super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_act2);

   // }
//}
public class Act2 extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabItem customization, nearme,myfav,myacc;
    public PagerAdapter pagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        tabLayout=(TabLayout) findViewById(R.id.tablayout);
        customization=(TabItem) findViewById(R.id.customization_button);
        nearme=(TabItem)findViewById(R.id.nearme_button);
        myfav=(TabItem)findViewById(R.id.my_favorite_button);
        myacc=(TabItem)findViewById(R.id.my_account_button);
        viewPager =findViewById(R.id.viewpager);
        pagerAdapter=new PageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0){
                    pagerAdapter.notifyDataSetChanged();}
                else if (tab.getPosition()==1){
                    pagerAdapter.notifyDataSetChanged();}
                else if (tab.getPosition()==2){
                    pagerAdapter.notifyDataSetChanged();}
                else if (tab.getPosition()==3){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }


}


package com.example.fragmentwhatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewpageradapter:ViewPagerAdapter= ViewPagerAdapter(supportFragmentManager)
        viewpageradapter.addFragment(CallFragment(),"Call")
        viewpageradapter.addFragment(ContactFragment(),"Contact")
        viewpageradapter.addFragment(FavoriteFragment(),"Favorite")


        viewPagerId.adapter = viewpageradapter
        tab.setupWithViewPager(viewPagerId)

        //remove shadow from the action bar
        val actionbar : ActionBar? = supportActionBar
        actionbar?.elevation =0f

        tab.getTabAt(0)?.customView //setIcon(R.drawable.ic_launcher_background)
    }



}

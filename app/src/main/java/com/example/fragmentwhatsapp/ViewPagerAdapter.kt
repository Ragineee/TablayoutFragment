package com.example.fragmentwhatsapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    val firstfragment = arrayListOf<Fragment>()
    val firsttitles = arrayListOf<String>()

    override fun getItem(position: Int): Fragment {
        return firstfragment.get(position)
    }

    override fun getCount(): Int {
        return firsttitles.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return firsttitles.get(position)//super.getPageTitle(position)
    }

    fun addFragment(fragment: Fragment,title: String){

        firstfragment.add(fragment)
        firsttitles.add(title)
    }
}
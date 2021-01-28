package com.josh.ui_try5.Adapter

import fragments.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

internal class PagerViewAdapter (fm:FragmentManager?): FragmentPagerAdapter(fm!!){
    override fun getCount(): Int {
        return 5
    }

    override fun getItem(position: Int): Fragment {

        return when(position){
            0 -> {
                HomeFragment()
            }

            1 -> {
                NotesFragment()
            }

            2 -> {
                RoadSignsFragment()
            }

            3 -> {
                MtbFragment()
            }
            4 -> {
                QuestionsFragment()
            }
            else -> HomeFragment()
        }
    }

}
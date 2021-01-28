package com.josh.ui_try5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewpager.widget.ViewPager
import com.josh.ui_try5.Adapter.PagerViewAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var notesBtn: ImageView
    private lateinit var roadSignBtn: ImageView
    private lateinit var homeBtn: ImageView
    private lateinit var mtbBtn: ImageView
    private lateinit var questionsBtn: ImageView
    private lateinit var mPagerViewAdapter: PagerViewAdapter
    private lateinit var mViewPager: ViewPager



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // init views
        mViewPager = findViewById(R.id.mViewPager)

        //init image buttons

        homeBtn = findViewById(R.id.homeBtn)
        notesBtn = findViewById(R.id.notesBtn)
        roadSignBtn = findViewById(R.id.roadSignsBtn)
        mtbBtn = findViewById(R.id.mtbBtn)
        questionsBtn = findViewById(R.id.questionsBtn)

        // onclick listener


        homeBtn.setOnClickListener {
            mViewPager.currentItem = 0
        }

        notesBtn.setOnClickListener {
            mViewPager.currentItem = 1
        }

        roadSignBtn.setOnClickListener {
            mViewPager.currentItem = 2
        }

        mtbBtn.setOnClickListener {
            mViewPager.currentItem = 3
        }

        questionsBtn.setOnClickListener {
            mViewPager.currentItem = 4
        }

        mPagerViewAdapter = PagerViewAdapter(supportFragmentManager)
        mViewPager.adapter=mPagerViewAdapter
        mViewPager.offscreenPageLimit = 5

        // add page change Listener

        mViewPager.addOnPageChangeListener(object :ViewPager.OnPageChangeListener{

            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {

                changingTabs(position)
            }
        })
            mViewPager.currentItem = 0
            homeBtn.setImageResource(R.drawable.home_red)

    }

    private fun changingTabs(position: Int) {

        if(position == 0){
            homeBtn.setImageResource(R.drawable.home_red)
            notesBtn.setImageResource(R.drawable.notes)
            roadSignBtn.setImageResource(R.drawable.road_sign)
            mtbBtn.setImageResource(R.drawable.mtb)
            questionsBtn.setImageResource(R.drawable.questions)
        }

        if(position == 1){
            homeBtn.setImageResource(R.drawable.home)
            notesBtn.setImageResource(R.drawable.notes_red)
            roadSignBtn.setImageResource(R.drawable.road_sign)
            mtbBtn.setImageResource(R.drawable.mtb)
            questionsBtn.setImageResource(R.drawable.questions)
        }

        if(position == 2){
            homeBtn.setImageResource(R.drawable.home)
            notesBtn.setImageResource(R.drawable.notes)
            roadSignBtn.setImageResource(R.drawable.road_sign_red)
            mtbBtn.setImageResource(R.drawable.mtb)
            questionsBtn.setImageResource(R.drawable.questions)
        }

        if(position == 3){
            homeBtn.setImageResource(R.drawable.home)
            notesBtn.setImageResource(R.drawable.notes)
            roadSignBtn.setImageResource(R.drawable.road_sign)
            mtbBtn.setImageResource(R.drawable.mtb_red)
            questionsBtn.setImageResource(R.drawable.questions)
        }
        if(position == 4){
            homeBtn.setImageResource(R.drawable.home)
            notesBtn.setImageResource(R.drawable.notes)
            roadSignBtn.setImageResource(R.drawable.road_sign)
            mtbBtn.setImageResource(R.drawable.mtb)
            questionsBtn.setImageResource(R.drawable.questions_red)
        }
    }
}


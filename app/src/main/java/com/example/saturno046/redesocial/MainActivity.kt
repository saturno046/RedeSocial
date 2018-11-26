package com.example.saturno046.redesocial

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_slider.*
import kotlinx.android.synthetic.main.fragment_slider.view.*

class MainActivity : AppCompatActivity() {

    val fragment1 = SliderFragment()
    val fragment2 = SliderFragment()
    val fragment3 = SliderFragment()
    lateinit var adpter : myPagerAdapter
    lateinit var activity : Activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity = this

        fragment1.setTitle("Aprender")
        fragment2.setTitle("Produzir")
        fragment3.setTitle("A teoria e a prática juntas!")

        adpter = myPagerAdapter(supportFragmentManager)

        adpter.list.add(fragment1)
        adpter.list.add(fragment2)
        adpter.list.add(fragment3)

        view_pager.adapter = adpter

      //  var btnent: Button
      //  bent = findViewById(R.id.btnEntra) as Button

      //  btnent = findViewById(R.id.btnEntra) as Button

        view_pager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener{

            override fun onPageScrollStateChanged(p0: Int) {

            }

            override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {

            }

            override fun onPageSelected(p0: Int) {

               if (p0 == adpter.list.size-1){
                   //lastpage
                  // btn_next.text = "Done"
               //    btnent.visibility = View.INVISIBLE

               }else{
              //     btnent.visibility = View.INVISIBLE
                   //has next page
             //      btn_next.text = "next"
             //      btn_next.setOnClickListener {
             //          view_pager.currentItem++
             //      }
             //      btn_skip.setOnClickListener {
             //          view_pager.currentItem--
             //      }
               }


                when(view_pager.currentItem){
                    0 ->{
                        indicador1.setTextColor(Color.BLACK)
                        indicador2.setTextColor(Color.GRAY)
                        indicador3.setTextColor(Color.GRAY)

                    }
                    1 ->{
                        indicador1.setTextColor(Color.GRAY)
                        indicador2.setTextColor(Color.BLACK)
                        indicador3.setTextColor(Color.GRAY)

                    }
                    2 ->{
                        indicador1.setTextColor(Color.GRAY)
                        indicador2.setTextColor(Color.GRAY)
                        indicador3.setTextColor(Color.BLACK)

                    }
                }
            }

        })

    }


    class myPagerAdapter(manager : FragmentManager) : FragmentPagerAdapter(manager){


        val list : MutableList<Fragment> = ArrayList()

        override fun getItem(p0: Int): Fragment {
            return list[p0]
        }
        override fun getCount(): Int {
            return list.size
        }
    }

}

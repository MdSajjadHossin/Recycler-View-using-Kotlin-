package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<News>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l,
            R.drawable.m,
        )

        heading = arrayOf(
            "The nation will observe Jail Killing Day today by paying rich tributes to four national leaders.",
            "Current account balance: Sinks further in red",
            "State-owned sugar mills: Closed to cut costs but continue to incur loss",
            "Happy birthday to the evergreen Moushumi",
            "North Korea fires possible ICBM; residents in Japan told to shelter",
            "Kane eyes becoming England's greatest goalscorer and ending",
            "Islamic banking poised to expand",
            "Bale shrugs off fitness fears ahead of Wales World Cup return",
            "Haris replaces injured Zaman for Pakistan at T20 World Cup",
            "Forget COP27, the youth should hold an 'Accountability COP's",
            "Why we should be concerned about Italy’s",
            "Inflation is yet another blow to education",
            "Economic and political reforms must go hand in",
        )

        newRecyclerView = findViewById(R.id.recyclerView)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<News>()
        getUserdata()
    }

    private fun getUserdata() {
        for(i in imageId.indices){
            val news = News(imageId[i], heading[i])
            newArrayList.add(news);
        }

        newRecyclerView.adapter = MyAdapter(newArrayList)
    }

}
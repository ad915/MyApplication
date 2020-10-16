package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.jsoup.Jsoup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var num:Int
        var num= 1111111
        Log.d("태그", "내용:" + num.toString())
        Log.d("태그", "내용: " + num::class.simpleName) // Int

        println("내용print: "+num)



    }


}
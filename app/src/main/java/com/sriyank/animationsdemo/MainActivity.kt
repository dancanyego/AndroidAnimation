package com.sriyank.animationsdemo

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    lateinit var batteryAnimation: AnimationDrawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()

        targetImage.setBackgroundResource(R.drawable.battery_animation_list)
        batteryAnimation = targetImage.background as AnimationDrawable
        batteryAnimation.start()
    }

    // Button click event handler 
    fun startStopAnimation(view: View) {

        if (batteryAnimation.isRunning)
            batteryAnimation.stop()
        else
            batteryAnimation.start()
    }
}

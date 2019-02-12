package com.sriyank.animationsdemo

import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        avdImage.setOnClickListener {
            checkToClose()
        }
    }

    private fun checkToClose() {

        avdImage.setImageResource(R.drawable.avd_check_to_close)
        val avdCheckToClose = avdImage.drawable as AnimatedVectorDrawable
        avdCheckToClose.start()
    }
}

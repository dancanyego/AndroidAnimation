package com.sriyank.animationsdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

	}

	fun scaleAnimation(view: View) {

		val scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_anim)
		targetImage.startAnimation(scaleAnimation)
	}

	fun translateAnimation(view: View) {

		val translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_anim)
		targetImage.startAnimation(translateAnimation)
	}

	fun fadeAnimation(view: View) {

		val alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim)
		targetImage.startAnimation(alphaAnimation)
	}

	fun rotateAnimation(view: View) {

		val rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim)
		targetImage.startAnimation(rotateAnimation)
	}
}

package com.sriyank.animationsdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Animation.AnimationListener {

	private var scaleAnimation: Animation? = null
	private var translateAnimation: Animation? = null
	private var rotateAnimation: Animation? = null
	private var alphaAnimation: Animation? = null

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

	}

	fun scaleAnimation(view: View) {

		scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_anim)
		scaleAnimation?.setAnimationListener(this)
		targetImage.startAnimation(scaleAnimation)
	}

	fun translateAnimation(view: View) {

		translateAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_anim)
		translateAnimation?.setAnimationListener(this)
		targetImage.startAnimation(translateAnimation)
	}

	fun fadeAnimation(view: View) {

		alphaAnimation = AnimationUtils.loadAnimation(this, R.anim.alpha_anim)
		alphaAnimation?.setAnimationListener(this)
		targetImage.startAnimation(alphaAnimation)
	}

	fun rotateAnimation(view: View) {

		rotateAnimation = AnimationUtils.loadAnimation(this, R.anim.rotate_anim)
		rotateAnimation?.setAnimationListener(this)
		targetImage.startAnimation(rotateAnimation)
	}

	// Implementation of AnimationListener functions
	override fun onAnimationStart(animation: Animation?) {

		if (animation == scaleAnimation)
			Toast.makeText(this, "Scale Animation Started", Toast.LENGTH_SHORT).show()

		if (animation == rotateAnimation)
			Toast.makeText(this, "Rotate Animation Started", Toast.LENGTH_SHORT).show()

		if (animation == translateAnimation)
			Toast.makeText(this, "Translate Animation Started", Toast.LENGTH_SHORT).show()

		if (animation == alphaAnimation)
			Toast.makeText(this, "Alpha Animation Started", Toast.LENGTH_SHORT).show()

	}

	override fun onAnimationEnd(animation: Animation?) {

		Toast.makeText(this, "Animation Ended", Toast.LENGTH_SHORT).show()
	}

	override fun onAnimationRepeat(animation: Animation?) {

		Toast.makeText(this, "Animation Repeated", Toast.LENGTH_SHORT).show()
	}
}

package com.sriyank.animationsdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.*
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity(), Animation.AnimationListener {

	private var scaleAnimation: Animation? = null
	private var translateAnimation: Animation? = null
	private var alphaAnimation: Animation? = null
	private var rotateAnimation: Animation? = null

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		targetImage.setOnClickListener {
			Toast.makeText(this, "View Clicked", Toast.LENGTH_SHORT).show()
		}
	}

	fun scaleAnimation(view: View) {

		scaleAnimation = ScaleAnimation(
				1.0f, 3.0f,
				1.0f, 3.0f,
				Animation.RELATIVE_TO_SELF, 0.5f,
				Animation.RELATIVE_TO_SELF, 0.5f
		)
		scaleAnimation?.apply {
			duration = 1000
			repeatCount = 1
			repeatMode = Animation.REVERSE
			setAnimationListener(this@MainActivity)
		}
		targetImage.startAnimation(scaleAnimation)
	}

	fun translateAnimation(view: View) {

		translateAnimation = TranslateAnimation(
				Animation.ABSOLUTE, 0.0f,
				Animation.ABSOLUTE, 0.0f,
				Animation.ABSOLUTE, 0.0f,
				Animation.ABSOLUTE, 350.0f
		)
		translateAnimation?.apply {
			duration = 1000
			fillAfter = true
			setAnimationListener(this@MainActivity)
		}
		targetImage.startAnimation(translateAnimation)
	}

	fun fadeAnimation(view: View) {

		alphaAnimation = AlphaAnimation(1.0f, 0.0f)
		alphaAnimation?.apply {
			duration = 1500
			repeatCount = 1
			repeatMode = Animation.REVERSE
			setAnimationListener(this@MainActivity)
		}
		targetImage.startAnimation(alphaAnimation)
	}

	fun rotateAnimation(view: View) {

		rotateAnimation = RotateAnimation(
				0.0f, -180f,
				Animation.RELATIVE_TO_SELF, 0.5f,
				Animation.RELATIVE_TO_SELF, 0.5f
		)
		rotateAnimation?.apply {
			duration = 1000
			repeatCount = 1
			repeatMode = Animation.REVERSE
			setAnimationListener(this@MainActivity)
		}
		targetImage.startAnimation(rotateAnimation)
	}

	// Implementation of AnimationListener functions
	override fun onAnimationStart(animation: Animation?) {

		if (animation == scaleAnimation)
			Toast.makeText(this, "Scale Animation Started", Toast.LENGTH_SHORT).show()

		if (animation == rotateAnimation)
			Toast.makeText(this, "Rotate Animation Started", Toast.LENGTH_SHORT).show()

		if (animation == translateAnimation)
//			Toast.makeText(this, "Translate Animation Started", Toast.LENGTH_SHORT).show()

		if (animation == alphaAnimation)
			Toast.makeText(this, "Alpha Animation Started", Toast.LENGTH_SHORT).show()

	}

	override fun onAnimationEnd(animation: Animation?) {

//		Toast.makeText(this, "Animation Ended", Toast.LENGTH_SHORT).show()
	}

	override fun onAnimationRepeat(animation: Animation?) {

//		Toast.makeText(this, "Animation Repeated", Toast.LENGTH_SHORT).show()
	}
}

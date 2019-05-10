package com.mlsdev.androidanimations.library.zoom.out

import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnimator

class ZoomOutDownAnimator(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnimator(view, animationParams) {
    override fun prepare(target: View) {
        val parent = target.parent as ViewGroup
        val distance: Float = (parent.height - target.top).toFloat()
        getAnimatorSet().playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1.0f, 1.0f, 0.0f),
            ObjectAnimator.ofFloat(target, "scaleX", 1.0f, 0.475f, 0.1f),
            ObjectAnimator.ofFloat(target, "scaleY", 1.0f, 0.475f, 0.1f),
            ObjectAnimator.ofFloat(target, "translationY", 0.0f, -60.0f, distance)
        )
    }

}
package com.mlsdev.androidanimations.library.zoom.out

import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnimator

class ZoomOutRightAnimator(view: View, animationParams: AnimationParams) : BaseViewAnimator(view, animationParams) {
    override fun prepare(target: View) {
        val parent = target.parent as ViewGroup
        val distance = (parent.width - parent.left).toFloat()
        getAnimatorSet().playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1.0f, 1.0f, 0.0f),
            ObjectAnimator.ofFloat(target, "scaleX", 1.0f, 0.475f, 0.1f),
            ObjectAnimator.ofFloat(target, "scaleY", 1.0f, 0.475f, 0.1f),
            ObjectAnimator.ofFloat(target, "translationX", 0.0f, -42.0f, distance)
        )
    }
}
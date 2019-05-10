package com.mlsdev.androidanimations.library.zoom.`in`

import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnimator

class ZoomInAnimator(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnimator(view, animationParams) {
    override fun prepare(target: View) {
        getAnimatorSet().playTogether(
            ObjectAnimator.ofFloat(target, "scaleX", 0.45f, 1.0f),
            ObjectAnimator.ofFloat(target, "scaleY", 0.45f, 1.0f),
            ObjectAnimator.ofFloat(target, "alpha", 0.0f, 1.0f)
        )
    }
}
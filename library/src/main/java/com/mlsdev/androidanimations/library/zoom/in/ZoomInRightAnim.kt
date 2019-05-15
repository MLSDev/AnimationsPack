package com.mlsdev.androidanimations.library.zoom.`in`

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import androidx.core.view.animation.PathInterpolatorCompat
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class ZoomInRightAnim(view: View, animationParams: AnimationParams) : BaseViewAnim(view, animationParams) {
    init {
        animationParams.interpolator = PathInterpolatorCompat.create(0.55f, 0.055f, 0.675f, 0.19f)
    }

    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "scaleX", 0.1f, 0.475f, 1.0f),
            ObjectAnimator.ofFloat(target, "scaleY", 0.1f, 0.475f, 1.0f),
            ObjectAnimator.ofFloat(target, "translationX", target.width.toFloat(), -20.0f, 0.0f),
            ObjectAnimator.ofFloat(target, "alpha", 0.0f, 1.0f, 1.0f)
        )

    }
}
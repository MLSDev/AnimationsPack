package com.mlsdev.androidanimations.library.zoom.out

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import androidx.core.view.animation.PathInterpolatorCompat
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class ZoomOutUpAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams) {
    init {
        animationParams.interpolator = PathInterpolatorCompat.create(0.55f, 0.055f, 0.675f, 0.19f)
    }

    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1.0f, 1.0f, 0.0f),
            ObjectAnimator.ofFloat(target, "scaleX", 1.0f, 0.475f, 0.1f),
            ObjectAnimator.ofFloat(target, "scaleY", 1.0f, 0.475f, 0.1f),
            ObjectAnimator.ofFloat(target, "translationY", 0.0f, 60.0f, -target.height.toFloat())
        )
    }
}
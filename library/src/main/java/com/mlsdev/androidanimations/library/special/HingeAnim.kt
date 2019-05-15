package com.mlsdev.androidanimations.library.special

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.animation.AccelerateInterpolator
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class HingeAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams) {
    init {
        animationParams.interpolator = AccelerateInterpolator()
    }
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        target.pivotX = 0.0f
        target.pivotY = target.height.toFloat()
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f),
            ObjectAnimator.ofFloat(target, "rotation", 0.0f, 80.0f, 60.0f, 80.0f, 60.0f,  60.0f, 60.0f),
            ObjectAnimator.ofFloat(target, "translationY", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 700.0f)
        )
    }
}
package com.mlsdev.androidanimations.library.bounce.out

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class BounceOutLeftAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams)  {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        val targetWidth = target.width.toFloat()
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1.0f, 1.0f, 0.0f),
            ObjectAnimator.ofFloat(target, "translationX", 0.0f, 40.0f, -targetWidth)
        )
    }
}
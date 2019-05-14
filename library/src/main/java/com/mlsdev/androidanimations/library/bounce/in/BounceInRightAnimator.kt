package com.mlsdev.androidanimations.library.bounce.`in`

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnimator

class BounceInRightAnimator(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnimator(view, animationParams)  {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        val targetWidth = target.width.toFloat()
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0.33f, 0.75f, 1.0f, 1.0f, 1.0f, 1.0f),
            ObjectAnimator.ofFloat(target, "translationX", targetWidth, 35f, -10f, 5f, 0f))
    }
}
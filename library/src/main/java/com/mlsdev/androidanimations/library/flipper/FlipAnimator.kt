package com.mlsdev.androidanimations.library.flipper

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnimator

class FlipAnimator(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnimator(view, animationParams)  {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "rotationY", 0.0f, 180.0f, 360.0f),
            ObjectAnimator.ofFloat(target, "scaleX", 1.0f, 1.5f, 1.0f),
            ObjectAnimator.ofFloat(target, "scaleY", 1.0f, 1.5f, 1.0f)
        )
    }
}
package com.mlsdev.androidanimations.library.flipper

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class FlipOutYAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams)  {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "rotationY", 0.0f, -20.0f, 90.0f),
            ObjectAnimator.ofFloat(target, "alpha", 1.0f, 1.0f, 0.0f)
        )
    }
}
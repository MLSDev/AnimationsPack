package com.mlsdev.androidanimations.library.bounce.`in`

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class BounceInAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams) {

    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0.0f, 0.33f, 0.66f, 1.0f, 1.0f, 1.0f, 1.0f),
            ObjectAnimator.ofFloat(target, "scaleX", 0.3f, 1.0f, 1.1f, 0.9f, 1.03f, 0.97f, 1.0f),
            ObjectAnimator.ofFloat(target, "scaleY", 0.3f, 1.0f, 1.1f, 0.9f, 1.03f, 0.97f, 1.0f)
        )
    }
}
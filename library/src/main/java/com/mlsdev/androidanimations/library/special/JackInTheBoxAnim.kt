package com.mlsdev.androidanimations.library.special

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class JackInTheBoxAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams) {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0.0f, 0.3f, 0.5f, 1.0f),
            ObjectAnimator.ofFloat(target, "scaleX", 0.1f, 0.45f, 0.65f, 1.0f),
            ObjectAnimator.ofFloat(target, "scaleY", 0.1f, 0.45f, 0.65f, 1.0f),
            ObjectAnimator.ofFloat(target, "rotation", 50.0f, -20.0f, 6.0f, 0.0f)
        )
    }
}
package com.mlsdev.androidanimations.library.special

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class RollInAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams) {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        target.pivotX = 0.0f
        target.pivotY = target.height.toFloat()
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0.0f, 1.0f),
            ObjectAnimator.ofFloat(target, "rotation", -120.0f, 0.0f)
        )
    }
}
package com.mlsdev.androidanimations.library.bounce.`in`

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnimator

class BounceInDownAnimator(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnimator(view, animationParams) {

    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0.33f, 0.75f, 1.0f, 1.0f, 1.0f, 1.0f),
            ObjectAnimator.ofFloat(target, "translationY", -target.height.toFloat(), 35f, -10f, 5f, 0f)
        )
    }
}
package com.mlsdev.androidanimations.library.attentionseeker

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.animation.BounceInterpolator
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnimator

class BounceAnimator(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnimator(view, animationParams) {
    init {
        animationParams.interpolator = BounceInterpolator()
    }

    override fun prepare(target: View, animatorSet: AnimatorSet) {
       animatorSet.playTogether(
           ObjectAnimator.ofFloat(target, "translationY", -50.0f, 0.0f)
       )
    }
}
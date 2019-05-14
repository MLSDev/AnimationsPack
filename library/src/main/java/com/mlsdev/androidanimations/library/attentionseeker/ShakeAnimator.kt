package com.mlsdev.androidanimations.library.attentionseeker

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnimator

class ShakeAnimator(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnimator(view, animationParams) {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(
                target,
                "translationX",
                0.0f,
                -10.0f,
                10.0f,
                -10.0f,
                10.0f,
                -10.0f,
                10.0f,
                -10.0f,
                10.0f,
                -10.0f,
                0.0f
            )
        )
    }
}
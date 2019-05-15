package com.mlsdev.androidanimations.library.attentionseeker

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class ShakeAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams) {
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
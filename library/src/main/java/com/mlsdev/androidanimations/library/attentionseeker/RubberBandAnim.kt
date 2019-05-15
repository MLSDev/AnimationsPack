package com.mlsdev.androidanimations.library.attentionseeker

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class RubberBandAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams) {

    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "scaleX", 1.0f, 1.25f, 0.75f, 1.15f, 0.95f, 1.05f, 1.0f),
            ObjectAnimator.ofFloat(target, "scaleY", 1.0f, 0.75f, 1.25f, 0.85f, 1.05f, 0.95f, 1.0f)
        )
    }
}
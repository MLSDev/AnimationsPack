package com.mlsdev.androidanimations.library.zoom.`in`

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class ZoomInUpAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams) {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0.0f, 1.0f, 1.0f),
            ObjectAnimator.ofFloat(target, "scaleX", 0.1f, 0.475f, 1.0f),
            ObjectAnimator.ofFloat(target, "scaleY", 0.1f, 0.475f, 1.0f),
            ObjectAnimator.ofFloat(target, "translationY", target.height.toFloat(), -60.0f, 0.0f)
        )
    }
}
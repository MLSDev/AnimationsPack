package com.mlsdev.androidanimations.library.zoom.out

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnimator

class ZoomOutAnimator(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnimator(view, animationParams) {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1.0f, 0.0f, 0.0f),
            ObjectAnimator.ofFloat(target, "scaleX", 1.0f, 0.3f, 0.0f),
            ObjectAnimator.ofFloat(target, "scaleY", 1.0f, 0.3f, 0.0f)
        )
    }
}
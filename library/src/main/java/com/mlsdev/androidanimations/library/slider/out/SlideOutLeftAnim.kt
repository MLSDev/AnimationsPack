package com.mlsdev.androidanimations.library.slider.out

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class SlideOutLeftAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams) {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        val width = target.width.toFloat()
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "translationX", 0.0f, -width)
        )
    }
}
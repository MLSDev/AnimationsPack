package com.mlsdev.androidanimations.library.slider.`in`

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class SlideInRightAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams) {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        val width = target.width.toFloat()
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "translationX", width, 0.0f)
        )
    }
}
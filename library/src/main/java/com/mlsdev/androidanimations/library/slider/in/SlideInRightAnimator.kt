package com.mlsdev.androidanimations.library.slider.`in`

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnimator

class SlideInRightAnimator(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnimator(view, animationParams) {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        val parent = target.parent as ViewGroup
        val distance = (parent.width - target.left).toFloat()
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "translationX", distance, 0.0f)
        )
    }
}
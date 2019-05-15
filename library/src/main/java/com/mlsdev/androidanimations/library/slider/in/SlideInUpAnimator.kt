package com.mlsdev.androidanimations.library.slider.`in`

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import android.view.ViewGroup
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class SlideInUpAnimator(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams) {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        val parent = target.parent as ViewGroup
        val distance = (parent.height - target.top).toFloat()
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "translationY", distance, 0.0f)
        )
    }
}
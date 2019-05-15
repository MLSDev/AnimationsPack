package com.mlsdev.androidanimations.library.slider

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class SlideInDownAnimator(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams) {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        val distance = (target.top + target.height).toFloat()
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "translationY", -distance, 0.0f)
        )
    }
}
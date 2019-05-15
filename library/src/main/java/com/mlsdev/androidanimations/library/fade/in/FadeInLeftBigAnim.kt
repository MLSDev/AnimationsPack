package com.mlsdev.androidanimations.library.fade.`in`

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class FadeInLeftBigAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams)  {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0.0f, 1.0f),
            ObjectAnimator.ofFloat(target, "translationX", -target.width.toFloat() * 4, 0.0f)
        )
    }
}
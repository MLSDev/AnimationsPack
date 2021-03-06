package com.mlsdev.androidanimations.library.rotate.out

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class RotateOutScaleAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams)  {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1.0f, 0.0f),
            ObjectAnimator.ofFloat(target, "rotation",0.0f, 200.0f),
            ObjectAnimator.ofFloat(target, "scaleX", 1.0f, 0.4f),
            ObjectAnimator.ofFloat(target, "scaleY", 1.0f, 0.4f)
        )
    }
}
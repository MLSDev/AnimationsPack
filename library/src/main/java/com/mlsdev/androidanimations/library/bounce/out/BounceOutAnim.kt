package com.mlsdev.androidanimations.library.bounce.out

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class BounceOutAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams)  {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.8f, 0.6f, 0.4f, 0.2f, 0.0f),
            ObjectAnimator.ofFloat(target, "scaleX", 1.0f, 0.8f, 1.2f,  0.3f),
            ObjectAnimator.ofFloat(target, "scaleY", 1.0f, 0.8f, 1.2f,  0.3f)
        )
    }
}
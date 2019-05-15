package com.mlsdev.androidanimations.library.rotate.out

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.mlsdev.androidanimations.library.AnimationParams
import com.mlsdev.androidanimations.library.BaseViewAnim

class RotateOutDownRightAnim(view: View, animationParams: AnimationParams = AnimationParams()) : BaseViewAnim(view, animationParams)  {
    override fun prepare(target: View, animatorSet: AnimatorSet) {
        target.pivotX = target.width.toFloat()
        target.pivotY = target.height.toFloat()
        animatorSet.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 1.0f, 0.0f),
            ObjectAnimator.ofFloat(target, "rotation", 0.0f, -45.0f)
        )
    }
}